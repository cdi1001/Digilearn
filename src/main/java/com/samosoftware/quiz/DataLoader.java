package com.samosoftware.quiz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    QuizRepository quizRepository;

    @Override
    public void run(String... args) throws Exception {
        quizRepository.save(new Quiz("Loops","Computers",100,100,"Beginner",1));
        quizRepository.save(new Quiz("Cells","Biology",100,100,"Intermediate",1));
        
    }
}