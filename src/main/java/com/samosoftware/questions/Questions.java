package com.samosoftware.questions;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Questions {
	private int QuizID;
	private int QuestionID;
	private String Question;
	private String Type;
	
	
	protected Questions() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getQuizID() {
		return QuizID;
	}

	public void setQuizID(int quizID) {
		QuizID = quizID;
	}
	
	
	public int getQuestionID() {
		return QuestionID;
	}

	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}
