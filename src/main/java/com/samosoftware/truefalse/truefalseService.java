package com.samosoftware.truefalse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class truefalseService {

	@Autowired
	private truefalseRepository repo;
	
	
	public List<truefalse> listAll() {
		return repo.findAll();
	}
	
	public void save( truefalse truefalse) {
		repo.save(truefalse);
	}
	
	public truefalse get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
