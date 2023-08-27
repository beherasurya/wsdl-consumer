//package com.app.soap.configuation;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration {
//
//	@Bean
//	public  InMemoryUserDetailsManager userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("user")
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(user);
//	}
//	
//	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception {
//		http.authorizeHttpRequests((authz) -> authz
//				.anyRequest()
//				.authenticated())
//				.httpBasic();
//		
//		return http.build();
//				
//	}
//	
//
//}
