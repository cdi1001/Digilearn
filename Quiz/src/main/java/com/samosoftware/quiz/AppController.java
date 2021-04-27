package com.samosoftware.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private QuizService service;
	
	@RequestMapping("/")
	public String viewHomePage( Model model) {
		List<Quiz> listQuiz = service.listAll();
		model.addAttribute("listQuiz", listQuiz);
		return "quizindex";
	}
	
	@RequestMapping("/new")
	public String shownewQuizPage (Model model) {
		Quiz quiz = new Quiz();
		model.addAttribute("Quiz", quiz);
		return "newquiz";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveQuiz(@ModelAttribute("Quiz") Quiz quiz) {
	    service.save(quiz);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditQuizPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("editquiz");
	    Quiz quiz= service.get(id);
	    mav.addObject("Quiz", quiz);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteQuiz(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/";       
	}
	
}
