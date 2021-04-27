package com.samosoftware.mcq;

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
    private mcqService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model) {
    List<mcq> listmcq = service.listAll();
    model.addAttribute("listmcq", listmcq);
    	return "mcqindex";
    }  
    
    @RequestMapping("/new")
    public String showNewmcqPage(Model model) {
    mcq mcq = new mcq();
    model.addAttribute("mcq", mcq);
    return "new_mcqquestion";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    
    	public String savemcq(@ModelAttribute("mcq") mcq mcq) {
    	service.save(mcq);
    	return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditmcqPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_mcqquestion");
        mcq mcq = service.get(id);
        mav.addObject("mcq", mcq);
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
	public String deletemcq(@PathVariable(name = "id") int id) {
	service.delete(id);
	return "redirect:/";
}
    
}
