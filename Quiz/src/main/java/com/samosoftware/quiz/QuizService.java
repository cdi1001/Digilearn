package com.samosoftware.quiz;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuizService {

	@Autowired
	private QuizRepository repo;
	
	
	public List<Quiz> listAll() {
		return repo.findAll();
	}
	
	public void save( Quiz quiz) {
		repo.save(quiz);
	}
	
	public Quiz get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
