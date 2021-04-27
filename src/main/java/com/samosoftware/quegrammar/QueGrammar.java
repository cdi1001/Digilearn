package com.samosoftware.quegrammar;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quegrammar")
public class QueGrammar implements Serializable{
	
	@EmbeddedId
	@Column(name="quegrammarid")
	private QueGrammarId quegrammarid;
	
	@Column(name="question")
	private String question;
	
	@Column(name= "response")
	private String response;
	
	@Column(name="timelimit")
	private int timelimit;
	
	@Column(name="wordlimit")
	private int wordlimit;
	
	@Column(name="level")
	private String level;
	
	@Column(name="category")
	private String category;

	
	public QueGrammar() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public QueGrammarId getQuegrammarid() {
		return quegrammarid;
	}

	public void setQuegrammarid(QueGrammarId quegrammarid) {
		this.quegrammarid = quegrammarid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}

	public int getWordlimit() {
		return wordlimit;
	}

	public void setWordlimit(int wordlimit) {
		this.wordlimit = wordlimit;
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

	@Override
	public String toString() {
		return "QueGrammar [quegrammarid=" + quegrammarid + ", question=" + question + ", response=" + response
				+ ", timelimit=" + timelimit + ", wordlimit=" + wordlimit + ", level=" + level + ", category="
				+ category + "]";
	}
	
	

}
