package com.samosoft.quefreetextandessay;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QueFreeTextAndEssayId implements Serializable {
	
	@Column(name="quizid")
	private int quizid;
	@Column(name="quesid")
	private int quesid;
	
	
	
	public QueFreeTextAndEssayId() {
		
		
	}

	public QueFreeTextAndEssayId(int quizid, int quesid) {
		
		this.quizid = quizid;
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
		QueFreeTextAndEssayId other = (QueFreeTextAndEssayId) obj;
		if (quesid != other.quesid)
			return false;
		if (quizid != other.quizid)
			return false;
		return true;
	}
	
	public int getQuizid() {
		return quizid;
	}
	
	public int getQuesid() {
		return quesid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}
	
	
	
	
}
