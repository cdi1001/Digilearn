package com.samosoftware.quegrammar;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QueGrammarId implements Serializable{
	
	@Column(name="quizid")
	private int quizid;
	@Column(name="quizid")
	private int quesid;
	
	public QueGrammarId() {
		
		// TODO Auto-generated constructor stub
	}

	public QueGrammarId(int quizid, int quesid) {
		super();
		this.quizid = quizid;
		this.quesid = quesid;
	}

	public int getQuizid() {
		return quizid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}

	public int getQuesid() {
		return quesid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quesid;
		result = prime * result + quizid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueGrammarId other = (QueGrammarId) obj;
		if (quesid != other.quesid)
			return false;
		if (quizid != other.quizid)
			return false;
		return true;
	}
	
	
	
	
	

}
