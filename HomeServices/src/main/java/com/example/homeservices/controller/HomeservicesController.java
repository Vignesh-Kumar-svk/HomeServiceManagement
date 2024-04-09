package com.example.homeservices.controller;


import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.homeservices.model.HomeServices;
import com.example.homeservices.repository.*;

@Controller
public class HomeservicesController {

	ServiceRepository servicerepo;

	public HomeservicesController(ServiceRepository servicerepo) {
		super();
		this.servicerepo = servicerepo;
	}
	
	@GetMapping("/Employee-registration")
	public String showServicereg(Model model) {
		model.addAttribute("servicereg", new HomeServices());
		return "servicepage";
	}
	
	@PostMapping("/Employee-registration")
	public ModelAndView Servicereg(HomeServices homeservice) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("servicereg",servicerepo.save(homeservice));
		mv.setViewName("SuccessfullyRegistered");
		return mv;
	}
}
