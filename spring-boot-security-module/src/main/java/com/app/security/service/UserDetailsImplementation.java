package com.app.security.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.security.dao.User;

public class UserDetailsImplementation implements UserDetails{

	
	private User user;
	
	
	public UserDetailsImplementation(User user) {
		super();
		this.user = user;
	}
	
	// in this we have to return collection of authorities
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		// will return all the unique collection from sigleton
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
