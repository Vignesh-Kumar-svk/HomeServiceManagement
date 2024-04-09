package com.example.homeservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/home")
	public ModelAndView showHome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("landingpage");
		return mv;
	}
	
	@GetMapping("/aboutus")
	public ModelAndView showaboutus() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("aboutus");
		return mv;
	}
}
