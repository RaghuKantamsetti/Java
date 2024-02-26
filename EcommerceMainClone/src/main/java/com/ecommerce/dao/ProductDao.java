package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.CartData;
import com.ecommerce.model.OrdersData;
import com.ecommerce.model.Product;

public interface ProductDao {

	public void saveProductData(Product product);

	public List<Product> getProductData(String productCat);

	public Product getProductDataById(int id);

	public boolean saveToCart(Product product, String username, int quantity);

	public List<CartData> getCartData(String username);

	public CartData getCartDataById(int id);

	public void saveOrders(CartData cartData);

	public void deleteFromCart(int id);

	public List<OrdersData> getOrderData(String username);

	public void deleteFromOrders(int id);

}
