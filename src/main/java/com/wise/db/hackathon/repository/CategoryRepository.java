package com.wise.db.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wise.db.hackathon.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
