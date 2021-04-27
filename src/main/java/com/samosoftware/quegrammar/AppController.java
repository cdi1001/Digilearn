package com.samosoftware.quegrammar;

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
	private QueGrammarServices service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<QueGrammar> listQue = service.listAll();
		model.addAttribute("listQueGrammar", listQue);
		return "quegrammarindex";
	}

	@RequestMapping("/new")
	public String showNewQueGrammarPage(Model model) {
		QueGrammar que = new QueGrammar();
		model.addAttribute("QueGrammar", que);
		return "newquegrammar";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveQueGrammar(@ModelAttribute("QueGrammar") QueGrammar que) {
		service.save(que);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditQueGrammarPage(@PathVariable(name = "quegrammarid") QueGrammarId id) {
		ModelAndView mav = new ModelAndView("editquegrammar");
		QueGrammar que = service.get(id);
		mav.addObject("quegrammar", que);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteQueGrammar(@PathVariable(name = "quegrammarid") QueGrammarId id) {
		service.delete(id);
		return "redirect:/";
	}
}
