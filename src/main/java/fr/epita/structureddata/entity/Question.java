package fr.epita.structureddata.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.ALL)
	private Set<Answer> answers;
	
	@ManyToOne
	private Quizz quizz;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	public Quizz getQuizz() {
		return quizz;
	}
	public void setQuizz(Quizz quizz) {
		this.quizz = quizz;
	}
	
}
