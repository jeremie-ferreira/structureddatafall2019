package fr.epita.structureddata.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Quizz extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	
	@OneToMany(mappedBy="quizz", cascade=CascadeType.ALL)
	private Set<Question> questions;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
}
