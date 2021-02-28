package com.app.security.fonfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


// for doing all the configurateion related to user security
@Configuration
@EnableWebSecurity
public class AppSecurityConfigure extends WebSecurityConfigurerAdapter{
/*
	//by default in spring5
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	*/
	

	@Autowired
	private UserDetailsService userDetailsService;
	
	// to varify/fetch user from the database 
	// this method will return obj of authentication provider
	

	@Bean 											// because we want to be spring bean which it returns
	public AuthenticationProvider authProvider() {
		
																				// by def but its implementation is required
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();	// this is responsible to talk to database
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder()); //never do this
		
		
		return provider;
		
	}
	
	
	/*
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method
		
		//in memory 
		List<UserDetails> users = new ArrayList<>();
		
		users.add(User.withDefault)
	}
*/	
	
		
}
