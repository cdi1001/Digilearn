package com.samosoftware.category;

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
    categoryRepository categoryRepository;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data",
                categoryRepository.findAll(PageRequest.of(page, 4)));
        model.addAttribute("currentPage", page);
        return "categorygui";
    }

    @PostMapping("/save")
    public String save(category category) {
    	categoryRepository.save(category);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deletecategory(int id) {
    	categoryRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public category findOne(int id) {
        return categoryRepository.findById(id).get();
    }
}