package com.ecommerce.cofiguration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder)
				.usersByUsernameQuery("select username,password,enabled from users where username =?")
				.authoritiesByUsernameQuery("select username, authority as role from roles where username=?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/main-page", "/cart-details-page","/cart/*", "/order-details-page", "/profile")
				.authenticated()
				.antMatchers("/add-product-form").hasAuthority("ROLE_ADMIN")
				.antMatchers("/register").permitAll()
				.and().formLogin().loginPage("/login").defaultSuccessUrl("/main-page").and().logout().and()
				.exceptionHandling().accessDeniedPage("/accessDenied");
		http.csrf().disable();
	}

}
