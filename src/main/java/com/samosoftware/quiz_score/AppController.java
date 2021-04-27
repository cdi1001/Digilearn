package com.samosoftware.quiz_score;

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
    private quiz_scoreService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model) {
    List<quiz_score> listquiz_score = service.listAll();
    model.addAttribute("listquiz_score", listquiz_score);
    	return "gui";
    }  
    
    @RequestMapping("/new")
    public String showNewquiz_scorePage(Model model) {
    	quiz_score quiz_score = new quiz_score();
    model.addAttribute("quiz_score", quiz_score);
    return "newquiz_score";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    
    	public String savequiz_score(@ModelAttribute("quiz_score") quiz_score quiz_score) {
    	service.save(quiz_score);
    	return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditquiz_scorePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("editquiz_score");
        quiz_score quiz_score = service.get(id);
        mav.addObject("quiz_score", quiz_score);
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
	public String deletequiz_score(@PathVariable(name = "id") int id) {
	service.delete(id);
	return "redirect:/";
}
    
}
