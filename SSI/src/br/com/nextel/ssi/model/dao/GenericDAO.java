package br.com.nextel.ssi.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class GenericDAO {

	private String dbName = "jdbc/wbr";

	@Autowired
	private SessionFactory sessionFactory;

	private NamedParameterJdbcTemplate namedParameterJdbc;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Autowired
	@Qualifier("dataSourceProfile")
	public void setDataSource(DataSource jdbc) {
		this.namedParameterJdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbc() {
		return namedParameterJdbc;
	}

	protected Connection getConnection() throws SQLException {
		

		
		InitialContext ctx = null;
		try {
			ctx = new InitialContext();
			Context webContext = (Context) ctx.lookup("java:/comp/env");
			DataSource datasource = (DataSource) webContext.lookup(dbName);
			return datasource.getConnection();
		} catch (Exception e) {
			throw new SQLException(e.getMessage(), e);
		} finally {
			if (ctx != null) {
				try {
					ctx.close();
				} catch (NamingException e) {
					// log.error(e);
				}
			}
		}
	}

	public void close(Connection conn, Statement st, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ex) {
				// ignore
			}
		}

		if (st != null) {
			try {
				st.close();
			} catch (SQLException ex) {
				// ignore
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException ex) {
				// ignore
			}
		}
	}

}
