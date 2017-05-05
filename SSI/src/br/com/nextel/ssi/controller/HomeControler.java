package br.com.nextel.ssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;
import br.com.nextel.ssi.model.entity.TwbrUserSystem;
import br.com.nextel.ssi.model.to.MenuProfile;
import br.com.nextel.ssi.service.UserService;

@Controller
public class HomeControler {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model, @RequestParam("username") String username){
	
		ReplVwbrUserNextel user = userService.getUserByLogin(username);
		model.addAttribute("user", user);
		
		System.out.println(user.toString());
		
		List<MenuProfile> menu = userService.getMenuProfile(username);
		for(MenuProfile m : menu){
			System.out.println(m);
		}
		model.addAttribute("menu", menu);

		TwbrUserSystem userSystem = userService.getUserSystemByLogin(username);
		model.addAttribute("userSystem", userSystem);
		
		System.out.println(userSystem.getCdLoginUser());
		System.out.println(userSystem.getManager().getCdLoginUser());
		System.out.println(userSystem.getLocality().getNmLocality());
		System.out.println(userSystem.getDefaulLocality().getNmLocality());
		
		return "user";
		
	}
	
	@RequestMapping("/teste")
	public String showTeste(Model model){
	
		return "teste";
		
	}	

}