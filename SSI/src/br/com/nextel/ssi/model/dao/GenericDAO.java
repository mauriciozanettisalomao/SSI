package br.com.nextel.ssi.model.dao;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class GenericDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	private NamedParameterJdbcTemplate jdbc;
	
	public Session session(){
		return 	sessionFactory.getCurrentSession();	
	}
	
	@Autowired
	@Qualifier("dataSourceProfile")
	public void setDataSource(DataSource jdbc){
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);		
	}

	public NamedParameterJdbcTemplate getJdbc() {
		return jdbc;
	}

	
	
}
