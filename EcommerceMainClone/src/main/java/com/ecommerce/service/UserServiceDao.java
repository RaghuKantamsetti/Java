package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Authorities;
import com.ecommerce.model.User;

public interface UserServiceDao {
	
	public void saveUserData(User user);

	public void saveAuthorities(Authorities authorities);

	public List<User> getUserDetails(String username);

	public List<User> getUserDetailsByEmail(String email);

	public boolean updatePassword(String username, String password);
}
