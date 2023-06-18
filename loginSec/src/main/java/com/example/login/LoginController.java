package com.example.login;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller


public class LoginController {
	
	@GetMapping("/")
	 public String index() {
		 return "index";
		 
	 }

	@GetMapping("/login")
	 public String login(Model model) {
		 model.addAttribute("login", new  Login	());
		 return "login";
		 
	 }
	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute("login") Login login){
		
		if (login.getUser().equals("perico") && login.getPassword().equals("palotes")){
			return "welcome";
		}else {
			return "login";
		}
		
	}
	
}
