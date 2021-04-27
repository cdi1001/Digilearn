package com.samosoftware.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    categoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
    	categoryRepository.save(new category("Maths",8,"Calculus","Integrals","Intermediate"));
    	categoryRepository.save(new category("Computer System",10,"Loops","For Loop","Beginner"));
        
    }
}