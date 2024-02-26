package com.ecommerce.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.model.Authorities;
import com.ecommerce.model.User;
import com.ecommerce.service.UserServiceDao;

@Controller
public class UserController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserServiceDao userServiceDao;

	@RequestMapping("/process-register")
	public String processRegisterdData(@Valid @ModelAttribute User user, BindingResult result, Model model) {
		model.addAttribute("user", user);
		if (result.hasErrors()) {
			return "register";
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setEnabled(1);
		Authorities authorities = new Authorities("ROLE_USER", user.getUsername());

		List<User> userdata = userServiceDao.getUserDetailsByEmail(user.getEmail());

		for (User u : userdata) {
			System.out.println("in for each loop");
			System.out.println("new email " + user.getEmail());
			System.out.println("old email " + u.getEmail());
			if (u.getEmail().equals(user.getEmail())) {

				return "email";
			}
		}
		List<User> userdata2 = userServiceDao.getUserDetails(user.getUsername());
		for (User u : userdata2) {

			if (u.getUsername().equals(user.getUsername())) {

				return "username";
			}
		}
		userServiceDao.saveUserData(user);
		userServiceDao.saveAuthorities(authorities);

		return "login";
	}

	@RequestMapping("/profile")
	public String profile(Principal principal, Model model) {
		String username = principal.getName();

		List<User> user = userServiceDao.getUserDetails(username);
		model.addAttribute("user", user);
		return "profile";
	}

	@RequestMapping("/password-update-form")
	public String passwordUpdateForm() {
		return "update-form";
	}

	@RequestMapping("/update-password")
	public String updatePassword(@RequestParam("username") String username, @RequestParam("password") String password) {
		String password1 = passwordEncoder.encode(password);
		if (userServiceDao.updatePassword(username, password1)) {
			return "login";
		}
		return "check-username";
	}

}