package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.dto.UserDto;

/*
 * author: Yasmin Rodriguez
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(Model model, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("phone") String phoneNumber, @RequestParam("password") String password,
			@RequestParam("gender") String gender, @RequestParam("city") String city) {
		UserDto newUser = new UserDto();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);
		newUser.setPhoneNumber(phoneNumber);
		newUser.setPassword(password);
		newUser.setGender(gender);
		newUser.setCity(city);
				
		return new ModelAndView("confirmation", "newUser", newUser);
	}
}