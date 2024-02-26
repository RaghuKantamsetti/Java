package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

	private int id;

	@NotEmpty(message = "Name feild should not empty")
	@NotNull(message = "Name feild should not NULL")
	private String name;

	@NotEmpty(message = "Email feild should not empty")
	@NotNull(message = "Email feild should not NULL")
	@Email(message = "Invalid Email format")
	private String email;

	@NotEmpty(message = "username feild should not empty")
//	@Pattern(regexp="^[a-zA-Z0-9]",message = "Username should contain Alphanumeric")
	private String username;

	@NotEmpty(message = "password feild should not empty")
	// @Size(min=8,max=40,message = "Password should be minimum of 6 to maximum of
	// 15 length and Alphanumeric")
	private String password;

	private int enabled;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

}
