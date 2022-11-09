package com.practice.project.users;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean
	CommandLineRunner commandLineRunner (UserRepository repository){
		return args ->{
			User user1 = new User("Mark Murphy", "markm@gmail.com");
			
			repository.saveAll(
					List.of(user1)
					);
		};
	}

}
