package com.ecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CartData;
import com.ecommerce.model.OrdersData;
import com.ecommerce.model.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
//	@Override
//	@Transactional
//	public void save(User user) {
//		this.getSession().persist(user);
//	}

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void saveProductData(Product product) {
		this.hibernateTemplate.save(product);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Product> getProductData(String productCat) {
		return (List<Product>) this.hibernateTemplate.findByNamedParam("from Product where productCat=:productCat",
				"productCat", productCat);
	}

	@Override
	public Product getProductDataById(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}

	@Override
	public boolean saveToCart(Product product, String username, int quantity) {
		CartData cartData = new CartData();

		List<CartData> list = (List<CartData>) this.hibernateTemplate
				.findByNamedParam("from CartData where username=:username", "username", username);
		for (CartData l : list) {
			if (product.getId()==l.getProductId()) {
				CartData cartData1 = getSession().load(CartData.class, l.getId());
				cartData1.setQuantity(quantity);
				cartData1.setTotalPrice(quantity * (Integer.parseInt(product.getProductPrice())));
				this.getSession().update(cartData1);
				return true;

			}
		}

		cartData.setUsername(username);
		cartData.setProductId(product.getId());
		cartData.setQuantity(quantity);
		cartData.setProductName(product.getProductName());
		cartData.setProductUrl(product.getProductUrl());
		cartData.setProductDesc(product.getProductDesc());
		cartData.setProductCat(product.getProductCat());
		cartData.setProductPrice(Integer.parseInt(product.getProductPrice()));
		cartData.setTotalPrice(quantity * (Integer.parseInt(product.getProductPrice())));

		this.hibernateTemplate.save(cartData);
		return true;
	}

	@Override
	public List<CartData> getCartData(String username) {
		return (List<CartData>) this.hibernateTemplate.findByNamedParam("from CartData where username=:username",
				"username", username);
	}

	@Override
	public CartData getCartDataById(int id) {
		return this.hibernateTemplate.get(CartData.class, id);
	}

	@Override
	public void saveOrders(CartData cartData) {
		OrdersData ordersData = new OrdersData();
		ordersData.setUsername(cartData.getUsername());
		ordersData.setQuantity(cartData.getQuantity());
		ordersData.setProductId(cartData.getProductId());
		ordersData.setProductName(cartData.getProductName());
		ordersData.setProductUrl(cartData.getProductUrl());
		ordersData.setProductDesc(cartData.getProductDesc());
		ordersData.setProductCat(cartData.getProductCat());
		ordersData.setProductPrice(cartData.getProductPrice());
		ordersData.setTotalPrice(cartData.getTotalPrice());
		this.hibernateTemplate.save(ordersData);
	}

	@Override
	public void deleteFromCart(int id) {
		CartData cartData = this.hibernateTemplate.get(CartData.class, id);
		this.hibernateTemplate.delete(cartData);
	}

	@Override
	public List<OrdersData> getOrderData(String username) {
		return (List<OrdersData>) this.hibernateTemplate.findByNamedParam("from OrdersData where username=:username",
				"username", username);
	}

	@Override
	public void deleteFromOrders(int id) {
		OrdersData ordersData = this.hibernateTemplate.get(OrdersData.class, id);
		this.hibernateTemplate.delete(ordersData);
	}
}
