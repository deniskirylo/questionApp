package com.practice.project.options;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.practice.project.question.Question;

@Entity
@Table(name = "options")
public class Option {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String option;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;

	public Option() {
	}

	public Option(String option, Question question) {
		super();
		this.option = option;
		this.question = question;
	}

	public Option(long id, String option, Question question) {
		super();
		this.id = id;
		this.option = option;
		this.question = question;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Option [id=" + id + ", option=" + option + ", question=" + question + "]";
	}
	
	
	
	
	
}
