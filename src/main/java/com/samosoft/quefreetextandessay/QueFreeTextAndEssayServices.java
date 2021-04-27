package com.samosoft.quefreetextandessay;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class QueFreeTextAndEssayServices {

	@Autowired
	private QueFreeTextAndEssayRepository repo;
	
	public List<QueFreeTextAndEssay> listAll() {
		return repo.findAll();
	}
	
	public void save( QueFreeTextAndEssay que) {
		repo.save(que);
	}
	
	public QueFreeTextAndEssay get (QueFreeTextAndEssayId id) {
		return repo.findById(id).get();
	}
	
	public void delete (QueFreeTextAndEssayId id) {
		repo.deleteById(id);
	}
}
