package com.home.BcriptTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BcriptTestApplication{

	public static void main(String[] args) {
		SpringApplication.run(BcriptTestApplication.class, args);
		test();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void test(){
		 BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		 //System.out.println(bCryptPasswordEncoder.encode("sAROJ"));
		 System.out.println(bCryptPasswordEncoder.matches("AROJ", "$2a$10$HKkHzsCzWPoukLVAiMn/eOJPCsfhsjlH11ET6lnt.Os.e0hfZ9VKO"));
		 System.out.println(bCryptPasswordEncoder.matches("sAROJ", "$2a$10$gjmFqUhM1Y0dZuUGZSnhzulvzRR5bNnLCUFegO9Xc1nBZWjZqvg5e"));
		 		
	}
}
