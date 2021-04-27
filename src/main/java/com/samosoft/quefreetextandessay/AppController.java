package com.samosoft.quefreetextandessay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {

	@Autowired
	private QueFreeTextAndEssayServices service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<QueFreeTextAndEssay> listQue = service.listAll();
		model.addAttribute("listQueFreeTextAndEssay", listQue);
		return "quefreetextandessayindex";
	}

	@RequestMapping("/new")
	public String showNewQueFreeTextAndEssayPage(Model model) {
		QueFreeTextAndEssay que = new QueFreeTextAndEssay();
		model.addAttribute("QueFreeTextAndEssay", que);
		return "newquefreetextandessay";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveQueFreeTextAndEssay(@ModelAttribute("QueFreeTextAndEssay") QueFreeTextAndEssay que) {
		service.save(que);
		return "redirect:/";
	}

	@RequestMapping("/edit/{QueFreeTextandEssayId}/{}")
	public ModelAndView showEditQueFreeTextAndEssayPage(@PathVariable(name = "id") QueFreeTextAndEssayId id) {
		ModelAndView mav = new ModelAndView("editquefreetextandessay");
		QueFreeTextAndEssay que = service.get(id);
		mav.addObject("QueFreeTextAndEssay", que);
		return mav;
	}

	@RequestMapping("/delete/{QueFreeTextandEssayId}")
	public String deleteQueFreeTextAndEssayPage(@PathVariable(name = "id") QueFreeTextAndEssayId id) {
		service.delete(id);
		return "redirect:/";
	}

}
