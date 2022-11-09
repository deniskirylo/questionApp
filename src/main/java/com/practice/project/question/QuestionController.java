package com.practice.project.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.options.Option;
import com.practice.project.options.OptionService;

@RestController
@RequestMapping(path="api/v1/questions")
public class QuestionController {
	
	private final QuestionService questionService; 
	
	@Autowired	
	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}
	
	@GetMapping
	@CrossOrigin
	public List <Question> getQuestions(){
		return questionService.getQuestions();
	}
	
	
//	@RequestMapping(value="/{question_id}", method = RequestMethod.GET)
//	public Question getQuestion(@PathVariable int num) {
//		return questionService.getQuestions().get(num);
//	}
//	
//	@RequestMapping(value = "/{num}", method = RequestMethod.GET)
//	public Question getQuestion(@PathVariable int num){
//		return questionService.getQuestions().get(num-1);
//	}

}
