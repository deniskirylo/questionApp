package com.practice.project.answers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.practice.project.options.Option;

import com.practice.project.users.User;

@Entity
@Table (name="answers")
public class Answer {
	
	@Id
	@GeneratedValue
	private long answerId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="option_id")
	private Option option;

	public Answer() {

	}

	public Answer(User user, Option option) {
		super();
		this.user = user;
		this.option = option;
	}

	public Answer(long answerId, User user, Option option) {
		super();
		this.answerId = answerId;
		this.user = user;
		this.option = option;
	}
	
	

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", user=" + user + ", option=" + option + "]";
	}
	
	
}
