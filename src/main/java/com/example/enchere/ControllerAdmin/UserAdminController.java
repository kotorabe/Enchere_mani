package com.example.enchere.ControllerAdmin;

import com.example.enchere.ModelAdmin.Categorie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enchere.ModelAdmin.Admin_User;

import java.util.ArrayList;

@Controller
@CrossOrigin
@RequestMapping("/Admin")
public class UserAdminController {
	//@PostMapping("/LoginAdmin")
	/*public Admin_User login(@RequestBody Admin_User user) throws Exception
	{
		Admin_User login = new Admin_User().login(user);
		return login;
	}*/
	@PostMapping("/LoginAdmin")
	public String login(HttpServletRequest request, Admin_User user, Model ModelAdmin) throws Exception
	{
		user.setNom(request.getParameter("data01"));
		user.setMdp(request.getParameter("data02"));
		boolean login = new Admin_User().login(user);
		if(login == true){
			ArrayList<Categorie> liste = new Categorie().selectall();
			ModelAdmin.addAttribute("categ", liste);
			return "liste_categ";
		}else{
			String message = "Utilisateur inéxistant";
			ModelAdmin.addAttribute("err", message);
			return "index";
		}
	}
}
