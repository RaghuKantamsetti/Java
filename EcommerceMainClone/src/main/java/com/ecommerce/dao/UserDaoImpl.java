package com.ecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Authorities;
import com.ecommerce.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

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

	public void saveData(User user) {
		this.hibernateTemplate.save(user);
	}

	@Override
	public void saveAuthorities(Authorities authorities) {
		this.hibernateTemplate.save(authorities);
	}

	@Override
	public List<User> getUserDetails(String username) {
		return (List<User>) this.hibernateTemplate.findByNamedParam("from User where username=:username", "username",
				username);
	}

	@Override
	public List<User> getUserDetailsByEmail(String email) {
		return (List<User>) this.hibernateTemplate.findByNamedParam("from User where email=:email", "email", email);
	}

	@Override
	public boolean updatePassword(String username, String password) {
		List<User> list = (List<User>) this.hibernateTemplate.findByNamedParam("from User where username=:username",
				"username", username);
		for (User l : list) {
			if (username.equals(l.getUsername())) {
				System.out.println("This is innerloop for password"+username+" "+password);
				User user = getSession().load(User.class, l.getId());
				user.setPassword(password);
				this.getSession().update(user);
				return true;
			}
		}
		return false;
	}
}
