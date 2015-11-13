package com.sprhib.controller;//

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Team;

@Controller

public class LinkController {
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView mainPage1() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/link/home2")
	public ModelAndView listOfHome2() {
		ModelAndView modelAndView = new ModelAndView("home2");	
		
		return modelAndView;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

	
}
