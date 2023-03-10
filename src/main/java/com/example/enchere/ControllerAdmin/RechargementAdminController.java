package com.example.enchere.ControllerAdmin;

import java.util.ArrayList;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enchere.ModelAdmin.Rechargement;
import com.example.enchere.ModelAdmin.Vue.V_Utilisateur_Rechargement;

@Controller
@CrossOrigin
@RequestMapping("/RechargementAdmin")
public class RechargementAdminController {
	
	@PostMapping
	public boolean insertion(@RequestBody Rechargement recharge) throws Exception
	{
		boolean rech = new Rechargement().create(recharge);
		return rech;
	}
	@GetMapping("/valide")
	public boolean Validation_recharge(HttpServletRequest request, Rechargement recharge) throws Exception
	{
		String id = request.getParameter("id");
		int idrechargement = Integer.parseInt(id);
		boolean rech = new Rechargement().validation_insertion(idrechargement);
		return rech;
	}
	@GetMapping
	public ArrayList<V_Utilisateur_Rechargement> selectall() throws Exception
	{
		ArrayList<V_Utilisateur_Rechargement> liste  = new V_Utilisateur_Rechargement().selectAll();
		return liste;
	}
	
	@GetMapping("/{id}")
	public ArrayList<V_Utilisateur_Rechargement> selectById(@PathVariable("id") int id) throws Exception
	{
		ArrayList<V_Utilisateur_Rechargement> liste  = new V_Utilisateur_Rechargement().selectById(id);
		return liste;
	}
	
	@GetMapping("/liste_non_valide")
	/*public ArrayList<V_Utilisateur_Rechargement> select_non_valide() throws Exception
	{
		ArrayList<V_Utilisateur_Rechargement> liste  = new V_Utilisateur_Rechargement().select_non_valide();
		return liste;
	}*/
	public String select_non_valide(Model ModelAdmin) throws Exception
	{
		ArrayList<V_Utilisateur_Rechargement> liste  = new V_Utilisateur_Rechargement().select_non_valide();
		ModelAdmin.addAttribute("non_recharge", liste);
		return "dmd_recharge";
	}
}
