package com.samosoftware.quiz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="Quiz")

public class Quiz  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Quiz_ID")
	private int id;
	@Column(name = "Quiz_Name")
	private String quiz_name;
	@Column(name = "Category")
    private String category;
	@Column(name = "Duration")
    private int duration;
	@Column(name = "Marks")
    private int marks;
	@Column(name = "Level")
    private String level;
	@Column(name = "Attempts_Available")
    private int attempts_available;

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuiz_name() {
		return quiz_name;
	}
	public void setQuiz_name(String quiz_name) {
		this.quiz_name = quiz_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getAttempts_available() {
		return attempts_available;
	}
	public void setAttempts_available(int attempts_available) {
		this.attempts_available = attempts_available;
	}
	public Quiz(String quiz_name, String category, int duration, int marks, String level, int attempts_available) {
		super();
		this.quiz_name = quiz_name;
		this.category = category;
		this.duration = duration;
		this.marks = marks;
		this.level = level;
		this.attempts_available = attempts_available;
	}
	public Quiz() {
		
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quiz_name=" + quiz_name + ", category=" + category + ", duration=" + duration
				+ ", marks=" + marks + ", level=" + level + ", attempts_available=" + attempts_available + "]";
	}

	
}