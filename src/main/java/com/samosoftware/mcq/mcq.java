package com.samosoftware.mcq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="mcq")

public class mcq  {
	@Column(name="qid")
	private int qid;
	@Column(name="question")
	private String question;
	@Column(name="option_1")
	private String option_1;
	@Column(name="option_2")
	private String option_2;
	@Column(name="option_3")
	private String option_3;
	@Column(name="option_4")
	private String option_4;
	@Column(name="answer")
	private String answer;
	@Column(name="timelimit")
	private int timelimit;
	@Column(name="quiz_id")
	private int quiz_id;
	@Column(name="level")
	private String level;
	@Column(name="category")
	private String category;
	@Column(name="marks")
	private int marks;
	

    protected mcq() {
    	super();
    }
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOption_1() {
		return option_1;
	}


	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}


	public String getOption_2() {
		return option_2;
	}


	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}


	public String getOption_3() {
		return option_3;
	}


	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}


	public String getOption_4() {
		return option_4;
	}


	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public int getTimelimit() {
		return timelimit;
	}


	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}


	public int getQuiz_id() {
		return quiz_id;
	}


	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

    
    
    
    }

