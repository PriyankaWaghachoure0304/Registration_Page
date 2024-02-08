package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.entity.User;
import com.app.service.UserService;
@Controller
public class UserController {
@Autowired
	private UserService service;
	@GetMapping("/")
	public String register(Model model)
	{
		User user=new User();
		model.addAttribute("user", user);
		return "register";
	}
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user,Model model)
	{
		System.out.println(user.toString());
		model.addAttribute("user", user);
		model.addAttribute("message","you have register successfully");
		
		System.out.println(user);
		service.registerUser(user);
		model.addAttribute("user", user);
		model.addAttribute("message","you have register successfully");

		return "home";
	}
}
