package fr.epita.structureddata.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends DefaultEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Boolean valid;
	
	@ManyToOne
	private Question question;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
