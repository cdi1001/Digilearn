package com.samosoftware.questions;

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
	private QuestionsService service;
	
	@RequestMapping("/")
	public String viewHomePage( Model model) {
		List<Questions> listQuestions = service.listAll();
		model.addAttribute("listQuestions", listQuestions);
		return "index";
	}
	
	@RequestMapping("/new")
	public String shownewQuestionPage (Model model) {
		Questions questions = new Questions();
		model.addAttribute("Questions", questions);
		return "new_question";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveQuestion(@ModelAttribute("Questions") Questions questions) {
	    service.save(questions);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditQuestionPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_question");
	    Questions questions= service.get(id);
	    mav.addObject("Questions", questions);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteQuestion(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/";       
	}
	
}
