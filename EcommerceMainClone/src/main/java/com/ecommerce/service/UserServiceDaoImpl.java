package com.ecommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.UserDao;
import com.ecommerce.model.Authorities;
import com.ecommerce.model.User;

@Service
@Transactional
public class UserServiceDaoImpl implements UserServiceDao {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void saveUserData(User user) {
		 this.userDao.saveData(user);
	}

	@Override
    public void saveAuthorities(Authorities authorities) {
        this.userDao.saveAuthorities(authorities);
    }

	@Override
	public List<User> getUserDetails(String username) {
		return this.userDao.getUserDetails(username);
	}

	@Override
	public List<User> getUserDetailsByEmail(String email) {
		return this.userDao.getUserDetailsByEmail(email);
	}

	@Override
	public boolean updatePassword(String username, String password) {
		 return this.userDao.updatePassword(username,password);
	}

}
