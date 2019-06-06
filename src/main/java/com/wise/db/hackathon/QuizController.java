package com.wise.db.hackathon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wise.db.hackathon.model.Category;
import com.wise.db.hackathon.model.Level;
import com.wise.db.hackathon.model.Quizes;
import com.wise.db.hackathon.repository.CategoryRepository;
import com.wise.db.hackathon.repository.LevelRepository;
import com.wise.db.hackathon.repository.QuizesRepository;

@RestController
@CrossOrigin
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private LevelRepository levelRepository;

	@Autowired
	private QuizesRepository quizesRepository;

	@GetMapping(value = "category")
	public List<Category> findAllCategory() {
		return categoryRepository.findAll();
	}

	@GetMapping(value = "quizes")
	public List<Quizes> findAllQuizes() {
		return quizesRepository.findAll();
	}

	@GetMapping(value = "level")
	public List<Level> findAllLevels() {
		return levelRepository.findAll();
	}
}
