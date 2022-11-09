package com.practice.project.answers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
	
	private final AnswerRepository answerRepository;
	
	@Autowired
	public AnswerService(AnswerRepository optionRepository) {
		this.answerRepository = optionRepository;
	}
	
	public List <Answer> getOptions(){
		return answerRepository.findAll();
	}

}
