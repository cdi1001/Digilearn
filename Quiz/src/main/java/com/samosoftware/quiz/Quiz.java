package com.samosoftware.quiz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {
	private int Quiz_ID;
	private String Quiz_Name;
    private String Category;
    private int Duration;
    private int Marks;
    private String Level;
    private int Attempts_Available;
	
	protected Quiz() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getQuiz_ID() {
		return Quiz_ID;
	}

	public void setQuizID(int QuizID) {
		Quiz_ID = QuizID;
	}
	public String getQuiz_Name() {
		return Quiz_Name;
	}

	public void setQuiz_Name(String quiz_name) {
		Quiz_Name = quiz_name;
	}
	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public int getAttempts_Available() {
		return Attempts_Available;
	}

	public void setAttempts_Available(int attempts_available) {
		Attempts_Available = attempts_available;
	}
	
}
