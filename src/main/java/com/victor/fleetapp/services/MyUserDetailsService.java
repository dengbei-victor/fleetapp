package com.victor.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.victor.fleetapp.models.User;
import com.victor.fleetapp.models.UserPrincipal;
import com.victor.fleetapp.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username);
			
			if(user == null) {
				throw new UsernameNotFoundException("User not found!");
			}
			
			return new UserPrincipal(user);
	}

}
