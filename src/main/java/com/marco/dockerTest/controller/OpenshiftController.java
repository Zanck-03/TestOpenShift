package com.marco.dockerTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenshiftController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView home () {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.html");
		
		return mv;
		
	}

}
