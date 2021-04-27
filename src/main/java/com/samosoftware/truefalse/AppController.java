package com.samosoftware.truefalse;

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
    private truefalseService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model) {
    List<truefalse> listtruefalse = service.listAll();
    model.addAttribute("listtruefalse", listtruefalse);
    	return "truefalseindex";
    }  
    
    @RequestMapping("/new")
    public String showNewtruefalsePage(Model model) {
    truefalse truefalse = new truefalse();
    model.addAttribute("truefalse", truefalse);
    return "new_truefalse";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    
    	public String savetruefalse(@ModelAttribute("truefalse") truefalse truefalse) {
    	service.save(truefalse);
    	return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEdittruefalsePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_truefalse");
        truefalse truefalse = service.get(id);
        mav.addObject("truefalse", truefalse);
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
	public String deletetruefalse(@PathVariable(name = "id") int id) {
	service.delete(id);
	return "redirect:/";
}
    
}
