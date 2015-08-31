package com.sampleoneweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@RequestMapping(value="login" , method = RequestMethod.GET)
	public String login() {
		logger.debug("login");
		return "login";
	}
	
	
	@RequestMapping(value="authlogin" , method = RequestMethod.GET)
	public String authLogin(@RequestParam(value = "email") String email, @RequestParam("password")String password, Model model) {
		logger.debug("login - start");
		logger.info(email +" | "+password);
		logger.debug("login - end");
		return "home";
	}
	
	@RequestMapping(value="newuser" , method = RequestMethod.GET)
	public String newUser() {
		logger.debug("newUser");
		return "register";
	}
	
	
	@RequestMapping(value="register" , method = RequestMethod.POST)
	public String register(@RequestParam(value = "firstname") String firstname, @RequestParam(value = "lastname") String lastname, @RequestParam(value = "email") String email, @RequestParam("password")String password, Model model) {
		logger.debug("login - start");
		logger.info(firstname + " | " + lastname + " | " + email +" | "+password);
		logger.debug("login - end");
		return "home";
	}
	
	

}