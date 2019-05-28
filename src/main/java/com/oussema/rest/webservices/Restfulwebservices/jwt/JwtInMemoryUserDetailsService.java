package com.oussema.rest.webservices.Restfulwebservices.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "oussema",
        "$2a$10$ser08hFVglpzsHhuYli0X.vX.4PvKcrKGOwGTWgBXxAmAnj8z5ZSu", "ROLE_USER_2"));
  } 
  static {
	    inMemoryUserList.add(new JwtUserDetails(2L, "test",
	        "$2a$10$A/WOdQN1zJjDT1XUGIgw6uk/sARrvrqwl/9M/eQB03W8qvZdFZvTC", "ROLE_USER_2"));
	  } 
  
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


