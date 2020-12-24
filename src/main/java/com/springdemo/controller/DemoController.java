package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/index")
	public ModelAndView index() {
		System.out.println("111111111");
		return new ModelAndView("demo");
	}
}
