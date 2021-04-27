package com.samosoftware.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class categoryService {

	@Autowired
	private categoryRepository repo;
	
	
	public List<category> listAll() {
		return repo.findAll();
	}
	
	public void save( category category) {
		repo.save(category);
	}
	
	public category get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
