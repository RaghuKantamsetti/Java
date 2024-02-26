package com.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.CartData;
import com.ecommerce.model.OrdersData;
import com.ecommerce.model.Product;

@Service
@Transactional
public class ProductServiceDaoImpl implements ProductServiceDao {

	@Autowired
	private ProductDao productDao;

	@Override
	public void saveProductData(Product product) {
		this.productDao.saveProductData(product);
	}

	@Override
	public List<Product> getProductData(String productCat) {
		 return this.productDao.getProductData(productCat);
	}

	@Override
	public Product getProductDataById(int id) {
		return this.productDao.getProductDataById(id);
	}

	@Override
	public void saveToCart(Product product, String username, int quantity) {
		this.productDao.saveToCart(product, username, quantity);
	}

	@Override
	public List<CartData> getCartData(String username) {
		return this.productDao.getCartData(username);
	}

	@Override
	public CartData getCartDataById(int id) {
		return this.productDao.getCartDataById(id);
	}

	@Override
	public void saveOrders(CartData cartData) {
		this.productDao.saveOrders(cartData);
	}

	@Override
	public void deleteFromCart(int id) {
		this.productDao.deleteFromCart(id);
	}

	@Override
	public List<OrdersData> getOrderData(String username) {
		return this.productDao.getOrderData(username);
	}

	@Override
	public void deleteFromOrder(int id) {
		this.productDao.deleteFromOrders(id);
	}
	
	

}
