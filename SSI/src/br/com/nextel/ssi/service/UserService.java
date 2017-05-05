package br.com.nextel.ssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextel.ssi.model.dao.MenuProfileDAO;
import br.com.nextel.ssi.model.dao.UserDAO;
import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;
import br.com.nextel.ssi.model.entity.TwbrUserSystem;
import br.com.nextel.ssi.model.to.MenuProfile;

@Service("userService")
public class UserService {
	
	private UserDAO userDAO;
	
	private MenuProfileDAO menuDAO;
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Autowired
	public void setMenuProfileDAO(MenuProfileDAO menu) {
		this.menuDAO = menu;
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

}
