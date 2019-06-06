package com.wise.db.hackathon;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(value = "/category")
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@GetMapping(value = "/category/{id}")
	public ResponseEntity<Collection<Quizes>> getAllQuizesByCategory(@PathVariable("id") int id) {
		Optional<Category> option = categoryRepository.findById(id);
		Category category = option.get();
		category.setQuizes(quizesRepository.findByCategoryId(category.getId()));
		return ResponseEntity.ok().body(category.getQuizes());
	}

	@GetMapping(value = "/quizes")
	public List<Quizes> getAllQuizes() {
		return quizesRepository.findAll();
	}

	@GetMapping(value = "/level")
	public List<Level> getAllLevels() {
		return levelRepository.findAll();
	}

	@GetMapping(value = "/quizes/{id}")
	public ResponseEntity<Quizes> getQuiz(@PathVariable("id") int id) {
		Optional<Quizes> option = quizesRepository.findById(id);
		return ResponseEntity.ok().body(option.get());
	}

}
