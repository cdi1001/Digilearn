package com.samosoftware.quiz_score;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class quiz_scoreService {

	@Autowired
	private quiz_scoreRepository repo;
	
	
	public List<quiz_score> listAll() {
		return repo.findAll();
	}
	
	public void save( quiz_score quiz_score) {
		repo.save(quiz_score);
	}
	
	public quiz_score get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
