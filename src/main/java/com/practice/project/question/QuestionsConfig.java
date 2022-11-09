package com.practice.project.question;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionsConfig {
	
	//@Bean
	CommandLineRunner commandLineRunner1 (QuestionRepository repository) {
			return args ->{
			Question question1 = new Question("How big is your company?");
		
			repository.saveAll(
					List.of(question1)
					);
		};
	}

}
