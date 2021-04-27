package com.samosoftware.questions;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestionsService {

	@Autowired
	private QuestionsRepository repo;
	
	
	public List<Questions> listAll() {
		return repo.findAll();
	}
	
	public void save( Questions questions) {
		repo.save(questions);
	}
	
	public Questions get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
