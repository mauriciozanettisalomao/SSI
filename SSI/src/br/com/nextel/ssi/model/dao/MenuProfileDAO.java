package br.com.nextel.ssi.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Component;

import br.com.nextel.ssi.model.to.MenuProfile;

@Component
public class MenuProfileDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	@Qualifier("dataSourceProfile")
	public void setDataSource(DataSource jdbc){
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);		
	}

	
    public List<MenuProfile> getMenuProfile(String cdLoginUser) {
    	
    	String sql = "select distinct dc_grupo, dc_funcionalidade, f.nu_sequencia "+
   			 "from	tnxperfil 		as a, "+
   			 "tnxusuario 		as b, "+
   			 "tnxperfil_usuario	as c, "+
   			 "tnxperfil_funcionalidade as d, "+
   			 "tnxfuncionalidade as e, "+
   			 "TNXGRUPO_FUNCIONALIDADE as f "+
   			 "where	b.cd_usuario	= c.cd_usuario "+
   			 "and	a.cd_perfil	= c.cd_perfil "+
   			 "and c.cd_perfil = d.cd_perfil "+
   			 "and d.cd_funcionalidade = e.cd_funcionalidade "+
   			 "and e.cd_grupo = f.cd_grupo "+
   			 "and a.cd_aplicacao = f.cd_aplicacao "+
   			 "and	a.cd_aplicacao	= 9 "+
   			 "and	a.cd_ambiente	= 1 "+
   			 "and	b.lg_usuario	= '"+cdLoginUser+"' "+
   			 "order by f.nu_sequencia";
    	
    	return jdbc.query(sql, new RowMapper<MenuProfile>() {

    		@Override
		        public MenuProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
		        	MenuProfile menu = new MenuProfile();
		        	menu.setDescriptionGroup(rs.getString("dc_grupo"));
		        	menu.setProfileFunctionality(rs.getString("dc_funcionalidade"));
		            menu.setSequence(rs.getInt("nu_sequencia"));
		            return menu;
	        }
	         
	    });
	        
   
    }

}
