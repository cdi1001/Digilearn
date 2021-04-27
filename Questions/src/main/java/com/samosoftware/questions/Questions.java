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

	public void setQuestionID(int quizID) {
		QuizID = quizID;
	}
	
	
	public int getQuestionID() {
		return QuestionID;
	}

	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}

	public String getQuiz_Name() {
		return Quiz_Name;
	}

	public void setQuiz_Name(String quiz_name {
		Quiz_Name = quiz_name;
	}

	

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}
