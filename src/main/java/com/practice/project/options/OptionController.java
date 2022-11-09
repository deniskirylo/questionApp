package com.practice.project.options;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/options")
public class OptionController {
	
	private final OptionService optionService;
	
	@Autowired
	public OptionController(OptionService optionService) {
		this.optionService = optionService;
	}
	
	@GetMapping
	public List <Option> getOptions(){
		return optionService.getOptions();
	}

}
