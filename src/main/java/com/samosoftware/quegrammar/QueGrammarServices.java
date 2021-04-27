package com.samosoftware.quegrammar;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class QueGrammarServices {

	@Autowired
	private QueGrammarRepository repo;
	
	public List<QueGrammar> listAll() {
		return repo.findAll();
	}
	
	public void save( QueGrammar que) {
		repo.save(que);
	}
	
	public QueGrammar get (QueGrammarId id) {
		return repo.findById(id).get();
	}
	
	public void delete (QueGrammarId id) {
		repo.deleteById(id);
	}
}
