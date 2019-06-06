package com.wise.db.hackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wise.db.hackathon.model.Quizes;

public interface QuizesRepository extends JpaRepository<Quizes, Integer>{
	public List<Quizes> findByCategoryId(Integer categoryId);

}
