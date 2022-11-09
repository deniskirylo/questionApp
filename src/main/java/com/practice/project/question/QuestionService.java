package com.practice.project.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	private final QuestionRepository questionRepository; 
	
	@Autowired
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List <Question> getQuestions(){
		return questionRepository.findAll();
	}
	
//	public List<Question> getFlights(String subOpt) {
//		List<Question>  = new ArrayList<>();
//		
//		return "":
//	}
//	
	
}
