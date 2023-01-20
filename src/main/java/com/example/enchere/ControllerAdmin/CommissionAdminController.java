package com.example.enchere.ControllerAdmin;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.enchere.ModelAdmin.Commission;

import java.util.ArrayList;

@Controller
@CrossOrigin
@RequestMapping("/CommissionAdmin")
public class CommissionAdminController {
	@PostMapping("/change")
	public boolean update(Commission commission, HttpServletRequest request) throws Exception
	{
		String com = request.getParameter("commission");
		commission.setCommission(Float.parseFloat(com));
		boolean comis = new Commission().update(commission);
		return comis;
	}

	@GetMapping("/list")
	public String selectAll(Model ModelAdmin) throws Exception
	{
		ArrayList<Commission> liste = new Commission().selectall();
		ModelAdmin.addAttribute("comm", liste);
		return "comission";
	}
}
