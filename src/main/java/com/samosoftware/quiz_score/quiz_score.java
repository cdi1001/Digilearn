package com.samosoftware.quiz_score;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="quiz_score")

public class quiz_score  {
	@Column(name = "student_id")
	private int student_id;
	@Column(name = "name")
	private String name;
	@Column(name = "quiz_id")
	private int quiz_id;
	@Column(name = "score")
	private int score;
	@Column(name = "ranking")
	private int ranking;
	@Column(name = "location")
	private String location;
	@Column(name = "country")
	private String country;

    protected quiz_score() {
    	super();
    }
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuiz_id() {
		return quiz_id;
	}

	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


   
  
    }

