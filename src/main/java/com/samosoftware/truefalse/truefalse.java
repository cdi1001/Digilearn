package com.samosoftware.truefalse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="truefalse")

public class truefalse  {
	@Column(name = "qid")
	private int qid;
	@Column(name = "question")
	private String question;
	@Column(name = "option_1")
	private boolean option_1;
	@Column(name = "option_2")
	private boolean option_2;
	@Column(name = "answer")
	private boolean answer;
	@Column(name = "timelimit")
	private int timelimit;
	@Column(name = "quiz_id")
	private int quiz_id;
	@Column(name = "marks")
	private int marks;

    protected truefalse() {
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

	public boolean isOption_1() {
		return option_1;
	}

	public void setOption_1(boolean option_1) {
		this.option_1 = option_1;
	}

	public boolean isOption_2() {
		return option_2;
	}

	public void setOption_2(boolean option_2) {
		this.option_2 = option_2;
	}

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

  
   
    }

