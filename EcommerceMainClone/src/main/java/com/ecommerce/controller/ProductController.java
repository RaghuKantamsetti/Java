package com.ecommerce.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.model.CartData;
import com.ecommerce.model.OrdersData;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductServiceDao;

@Controller
public class ProductController {

	@Autowired
	private ProductServiceDao productServiceDao;

	@RequestMapping("/process-product")
	public String processProductData(@Valid @ModelAttribute Product product, BindingResult result, Model model) {
		model.addAttribute("product", product);
		if (result.hasErrors()) {
			return "add-product-form";
		}
		productServiceDao.saveProductData(product);
		return "main-page";
	}

	@RequestMapping("/plp/{cat}")
	public String getProductData(@PathVariable("cat") String productCat, Model model) {

		List<Product> list = productServiceDao.getProductData(productCat);
		model.addAttribute("plist", list);
		return "plp-page";
	}

	@RequestMapping("/pdp/{id}")
	public String getProductDataById(@PathVariable("id") int id, Model model) {

		Product product = productServiceDao.getProductDataById(id);
		model.addAttribute("product", product);
		return "pdp-page";
	}

	@RequestMapping("/cart/{id}")
	public String addToCart(@PathVariable("id") int id, @RequestParam("quantity") int quantity, Model model,
			Principal principal) {

		String username = principal.getName();
		Product product = productServiceDao.getProductDataById(id);
		productServiceDao.saveToCart(product, username, quantity);
		List<CartData> list = productServiceDao.getCartData(username);
		if(list.isEmpty()) {
			return "empty-cart";
		}
		model.addAttribute("cartData", list);
		return "cart-details-page";
	}

	@RequestMapping("/cart-details-page")
	public String showCartData(Model model, Principal principal) {

		String username = principal.getName();
		List<CartData> list = productServiceDao.getCartData(username);
		if(list.isEmpty()) {
			return "empty-cart";
		}
		model.addAttribute("cartData", list);
		
		return "cart-details-page";
	}

	@RequestMapping("/order/{id}")
	public String addToOrders(@PathVariable("id") int id, Model model, Principal principal) {

		String username = principal.getName();
		CartData cartData = productServiceDao.getCartDataById(id);
		productServiceDao.saveOrders(cartData);
		productServiceDao.deleteFromCart(id);
		List<OrdersData> list = productServiceDao.getOrderData(username);
		if(list.isEmpty()) {
			return "empty-orders";
		}
		model.addAttribute("orderData", list);
		return "cart-details-page";
	}

	@RequestMapping("/order-details-page")
	public String showOrderData(Model model, Principal principal) {

		String username = principal.getName();
		List<OrdersData> list = productServiceDao.getOrderData(username);
		if(list.isEmpty()) {
			return "empty-orders";
		}
		model.addAttribute("orderData", list);
		return "order-details-page";
	}

	@RequestMapping("/removeCart/{id}")
	public String deleteFromCart(@PathVariable("id") int id, Model model, Principal principal) {

		String username = principal.getName();
		productServiceDao.deleteFromCart(id);
		List<CartData> list = productServiceDao.getCartData(username);
		if(list.isEmpty()) {
			return "empty-cart";
		}
		model.addAttribute("cartData", list);
		return "cart-details-page";

	}

	@RequestMapping("/removeOrder/{id}")
	public String deleteFromOrder(@PathVariable("id") int id, Model model, Principal principal) {

		String username = principal.getName();
		productServiceDao.deleteFromOrder(id);
		List<OrdersData> list = productServiceDao.getOrderData(username);
		if(list.isEmpty()) {
			return "empty-orders";
		}
		model.addAttribute("orderData", list);
		return "order-details-page";

	}

}