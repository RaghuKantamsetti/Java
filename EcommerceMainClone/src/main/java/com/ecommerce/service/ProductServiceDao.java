package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.CartData;
import com.ecommerce.model.OrdersData;
import com.ecommerce.model.Product;

public interface ProductServiceDao {

	// Save the product Details
	public void saveProductData(Product product);

	// get the product data using product category
	public List<Product> getProductData(String productCat);

	public Product getProductDataById(int id);

	public void saveToCart(Product product, String username, int quantity);

	public List<CartData> getCartData(String username);

	public CartData getCartDataById(int id);

	public void saveOrders(CartData cartData);

	public void deleteFromCart(int id);

	public List<OrdersData> getOrderData(String username);

	public void deleteFromOrder(int id);

}
