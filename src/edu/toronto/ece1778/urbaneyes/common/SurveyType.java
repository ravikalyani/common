package edu.toronto.ece1778.urbaneyes.common;

import java.io.Serializable;
import java.util.ArrayList;

public final class SurveyType implements Serializable {

	private int id;
	private String name;
	private ArrayList<Question> questions;
	
	public SurveyType() {
		questions = new ArrayList<Question>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Question> getQuestions() {
		return questions;
	}
	
	public void AddQuestion(Question q) {
		questions.add(q);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
