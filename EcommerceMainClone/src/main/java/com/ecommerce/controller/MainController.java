package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.model.Product;
import com.ecommerce.model.User;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/register")
	public String registerForm(@ModelAttribute("user") User user) {
		return "register";
	}

	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}

	@RequestMapping("/main-page")
	public String mainPage() {
		return "main-page";
	}

	@RequestMapping("/add-product-form")
	public String productForm(@ModelAttribute("product") Product product) {
		return "add-product-form";
	}

	@RequestMapping("/accessDenied")
	public String error() {
		return "access-denied";
	}

}
