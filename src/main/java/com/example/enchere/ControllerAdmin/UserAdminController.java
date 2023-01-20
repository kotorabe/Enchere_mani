package com.example.enchere.ControllerAdmin;

import com.example.enchere.ModelAdmin.Categorie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.example.enchere.ModelAdmin.Admin_User;

import java.util.ArrayList;

@Controller
@CrossOrigin
@RequestMapping("/Admin")
public class UserAdminController {
	@GetMapping
	public String login() throws Exception
	{
		return "index";
	}
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
