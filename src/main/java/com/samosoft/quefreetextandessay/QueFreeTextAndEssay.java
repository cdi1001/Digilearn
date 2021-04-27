package com.samosoft.quefreetextandessay;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quefreetextandessay")
public class QueFreeTextAndEssay implements Serializable{
	
	@EmbeddedId
	@Column(name="quefreetextandessayid")
	private QueFreeTextAndEssayId qid;
	@Column(name="question")
	private String question;
	@Column(name="keywords")
	private String keywords;
	@Column(name="timelimit")
	private int timelimit;
	@Column(name="wordlimit")
	private int wordlimit;
	@Column(name="level")
	private String level;
	@Column(name="category")
	private String category;
	
	@Override
	public String toString() {
		return "QueFreeTextAndEssay [qid=" + qid + ", question=" + question + ", keywords=" + keywords + ", timelimit="
				+ timelimit + ", wordlimit=" + wordlimit + ", level=" + level + ", category=" + category + "]";
	}

	protected QueFreeTextAndEssay() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public QueFreeTextAndEssayId getQid() {
		return qid;
	}

	public void setQid(QueFreeTextAndEssayId qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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

	
	
	
	
	
	

}
