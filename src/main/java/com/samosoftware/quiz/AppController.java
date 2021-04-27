package com.samosoftware.quiz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data",
                quizRepository.findAll(PageRequest.of(page, 4)));
        model.addAttribute("currentPage", page);
        return "quizgui";
    }

    @PostMapping("/save")
    public String save(Quiz quiz) {
        quizRepository.save(quiz);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteQuiz(int id) {
        quizRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Quiz findOne(int id) {
        return quizRepository.findById(id).get();
    }
}