package br.com.nextel.ssi.model.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;

@Component
public class UserJdbcManagerDAO extends UserJdbcDAO{

	public List<ReplVwbrUserNextel> getListManagerByCostCenterSpring(String costCenter){
		
		String sql ="SELECT DISTINCT C.id_user, "+
					"	             C.no_usuario, "+
					" 	             C.de_email, "+
					"            	 C.de_cargo "+
					"			FROM TWBR_RESPONSIBLE_COSTCENTER       A, "+
					"				 TWBR_COSTCENTER                   B, "+
				    " 				 VWBR_USER_NEXTEL                  C "+
					"	        WHERE RTRIM(B.cd_costcenter)   =   RTRIM(:costCenter) "+
					"	          AND RTRIM(B.cd_costcenter)   =   RTRIM(A.cd_costcenter) "+
					"	          AND RTRIM(C.id_user)         =   RTRIM(A.cd_federal_tax) "+
					"	          AND (UPPER(SUBSTR(C.de_cargo, 1, 3)) IN ('GER','DIR','PRE','VIC','CON') OR UPPER(SUBSTR(C.de_cargo, 1, 2)) IN ('VP')) "+
					"	    UNION "+
					"	        SELECT A.id_user "+
					"	             , A.no_usuario "+
					"	             , A.de_email "+
					"	             , A.de_cargo "+
					"	          FROM vwbr_user_nextel A "+
					"	         WHERE RTRIM(A.ID_CEN_CUSTO) = RTRIM(:costCenter) "+
					"	           AND UPPER(SUBSTR(A.de_cargo, 1, 3)) IN ('GER','DIR','PRE','VIC') "+
					"	      ORDER BY no_usuario";
		
		SqlParameterSource namedParameters = new MapSqlParameterSource("costCenter", costCenter);
		
    	return getNamedParameterJdbc().query(sql, namedParameters, new RowMapper<ReplVwbrUserNextel>() {

    		@Override
		        public ReplVwbrUserNextel mapRow(ResultSet rs, int rowNumber) throws SQLException {
    				ReplVwbrUserNextel user = new ReplVwbrUserNextel();
		        	user.setIdUser(rs.getString("id_user"));
		        	user.setNmUser(rs.getString("no_usuario"));
		        	user.setDeEmail(rs.getString("de_email"));
		        	user.setDeJobTitle(rs.getString("de_cargo"));
		        	System.out.println("Inside: "+user.toString());
		            return user;
	        }
	         
	    });

	}
	
	public List<ReplVwbrUserNextel> getListManagerByCostCenter(String costCenter){
		
		String sql ="SELECT DISTINCT C.id_user, "+
					"	             C.no_usuario, "+
					" 	             C.de_email, "+
					"            	 C.de_cargo "+
					"			FROM TWBR_RESPONSIBLE_COSTCENTER       A, "+
					"				 TWBR_COSTCENTER                   B, "+
				    " 				 VWBR_USER_NEXTEL                  C "+
					"	        WHERE RTRIM(B.cd_costcenter)   =   RTRIM(?) "+
					"	          AND RTRIM(B.cd_costcenter)   =   RTRIM(A.cd_costcenter) "+
					"	          AND RTRIM(C.id_user)         =   RTRIM(A.cd_federal_tax) "+
					"	          AND (UPPER(SUBSTR(C.de_cargo, 1, 3)) IN ('GER','DIR','PRE','VIC','CON') OR UPPER(SUBSTR(C.de_cargo, 1, 2)) IN ('VP')) "+
					"	    UNION "+
					"	        SELECT A.id_user "+
					"	             , A.no_usuario "+
					"	             , A.de_email "+
					"	             , A.de_cargo "+
					"	          FROM vwbr_user_nextel A "+
					"	         WHERE RTRIM(A.ID_CEN_CUSTO) = RTRIM(?) "+
					"	           AND UPPER(SUBSTR(A.de_cargo, 1, 3)) IN ('GER','DIR','PRE','VIC') "+
					"	      ORDER BY no_usuario";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		ArrayList<ReplVwbrUserNextel> list = new ArrayList<ReplVwbrUserNextel>();

		try {
		    conn = getConnection();
		    ps = conn.prepareStatement(sql);
		    ps.setString(1,costCenter);
		    ps.setString(2,costCenter);

		    rs = ps.executeQuery();

		    while (rs.next()) {
		    	ReplVwbrUserNextel user = new ReplVwbrUserNextel();
	        	user.setIdUser(rs.getString("id_user"));
	        	user.setNmUser(rs.getString("no_usuario"));
	        	user.setDeEmail(rs.getString("de_email"));
	        	user.setDeJobTitle(rs.getString("de_cargo"));
	        	list.add(user);
		    }

		} catch (SQLException e) {
		    System.out.println("Erro em findByIdCustomer: " + e.toString());
		} finally {
		    close(conn, ps, rs);
		}

		return list;

	}
	
}
