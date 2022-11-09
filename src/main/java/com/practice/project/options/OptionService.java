package com.practice.project.options;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
	
	private final OptionRepository optionRepository; 
	
	@Autowired
	public OptionService(OptionRepository optionRepository) {
		this.optionRepository = optionRepository;
	}
	
	public List <Option> getOptions(){
		return optionRepository.findAll();
	}

}
