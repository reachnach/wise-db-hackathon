package com.wise.db.hackathon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quizes implements Serializable {

	private static final long serialVersionUID = -3275276533996406805L;

	@Id
	private Integer id;

	@Column(name = "name")
	private String quizName;
	
	@Column(name="cat_id")
	private Integer categoryId;
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
}
