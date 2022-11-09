package com.practice.project.options;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.project.question.Question;
import com.practice.project.question.QuestionRepository;

@Configuration
public class OptionConfig {

	@Bean
	CommandLineRunner commandLineRunner2 (OptionRepository repository, QuestionRepository questionRepository) {
			return args ->{
			
			Question question1 = new Question("How big is your company?");	
			Question question2 = new Question("How many users do you have?");	
			Question question3 = new Question("What is the avarage age of the users?");	
			 
			questionRepository.saveAll(
					List.of(question1, question2, question3)
					);
				
			Option options1 = new Option("0-10", question1);
			Option options2 = new Option("10-100", question1);
			Option options3 = new Option(">100", question1);
			
			Option options4 = new Option("0-100", question2);
			Option options5 = new Option("100-1000", question2);
			Option options6 = new Option(">1000", question2);
			
			Option options7 = new Option("18-24", question3);
			Option options8 = new Option("24-44", question3);
			Option options9 = new Option(">44", question3);
			
			repository.saveAll(
					List.of(options1,options2,options3,options4,options5,options6,options7,options8,options9)
					);
		};
	}
}
