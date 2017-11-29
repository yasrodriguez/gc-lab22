package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.dao.UserDao;
import com.gc.dao.UserDaoHibernate;
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
			@RequestParam("email") String email, @RequestParam("phone") String phone, @RequestParam("userPassword") String userPassword,
			@RequestParam("gender") String gender, @RequestParam("city") String city) {
		UserDto newUser = new UserDto(firstName, lastName, email, phone, userPassword, gender, city);
		
		UserDao userDao = new UserDaoHibernate();
		userDao.insertUser(newUser);
				
		return new ModelAndView("confirmation", "newUser", newUser);
	}
}