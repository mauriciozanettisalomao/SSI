package br.com.nextel.ssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextel.ssi.model.dao.hibernate.UserDAO;
import br.com.nextel.ssi.model.dao.jdbc.MenuProfileDAO;
import br.com.nextel.ssi.model.dao.jdbc.UserJdbcManagerDAO;
import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;
import br.com.nextel.ssi.model.entity.TwbrUserSystem;
import br.com.nextel.ssi.model.to.MenuProfile;

@Service("userService")
public class UserService {
	
	private UserDAO userDAO;
	private UserJdbcManagerDAO userJdbcManagerDAO;
	private MenuProfileDAO menuDAO;
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Autowired
	public void setMenuProfileDAO(MenuProfileDAO menu) {
		this.menuDAO = menu;
	}
	
	@Autowired
	public void setUserJdbcManagerDAO(UserJdbcManagerDAO userJdbcManagerDAO) {
		this.userJdbcManagerDAO = userJdbcManagerDAO;
	}
	
	public List<MenuProfile> getMenuProfile(String cdLoginUser){
		return menuDAO.getMenuProfile(cdLoginUser);
		
	}
	
	public List<TwbrUserSystem> getAllUsers(){
		return userDAO.getAllUsers();
	}
	
	public ReplVwbrUserNextel getUserByLogin(String cdLoginUser){
		return userDAO.getUserByLogin(cdLoginUser);
	}

	public TwbrUserSystem getUserSystemByLogin(String cdLoginUser) {
		return userDAO.getUserSystemByLogin(cdLoginUser);
	}
	
	public List<ReplVwbrUserNextel> getManagerByCostCenter(String costCenter){
		return userJdbcManagerDAO.getListManagerByCostCenter(costCenter);
	}

	public void merge(TwbrUserSystem userSystem) {
		
		TwbrUserSystem user = userDAO.getUserSystemByLogin(userSystem.getCdLoginUser());
		
		user.setNrFleetId(userSystem.getNrFleetId());
		user.setNrNextelPhone(userSystem.getNrNextelPhone());
		user.setNrPhoneRamal(userSystem.getNrPhoneRamal());
		user.getManager().setIdUser(userSystem.getManager().getIdUser());
		
		userDAO.merge(user);		
	}
	

}
