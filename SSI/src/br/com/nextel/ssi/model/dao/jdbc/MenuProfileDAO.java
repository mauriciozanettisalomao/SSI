package br.com.nextel.ssi.model.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import br.com.nextel.ssi.model.dao.GenericDAO;
import br.com.nextel.ssi.model.to.MenuProfile;

@Component
public class MenuProfileDAO extends GenericDAO{
	
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
   			 "and	b.lg_usuario	= :cdLoginUser "+
   			 "order by f.nu_sequencia";
    	 
        SqlParameterSource namedParameters = new MapSqlParameterSource("cdLoginUser", cdLoginUser);
    	
    	return getNamedParameterJdbc().query(sql, namedParameters, new RowMapper<MenuProfile>() {

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
