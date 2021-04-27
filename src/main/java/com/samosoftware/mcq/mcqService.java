package com.samosoftware.mcq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class mcqService {

	@Autowired
	private mcqRepository repo;
	
	
	public List<mcq> listAll() {
		return repo.findAll();
	}
	
	public void save( mcq mcq) {
		repo.save(mcq);
	}
	
	public mcq get (int id) {
		return repo.findById(id).get();
	}
	
	public void delete (int id) {
		repo.deleteById(id);
	}
}
