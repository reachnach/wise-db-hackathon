package com.wise.db.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wise.db.hackathon.model.Quizes;

public interface QuizesRepository extends JpaRepository<Quizes, Integer>{

}
