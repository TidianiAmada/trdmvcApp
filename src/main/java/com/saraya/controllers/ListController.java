package com.saraya.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.model.Laptop;
import com.saraya.model.LaptopService;

@Controller
@SessionAttributes("username")
public class ListController {

	@Autowired
	LaptopService laptopservice;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String fstApp(ModelMap model) {
		String username=(String) model.get("username");
		List<Laptop> laptops = laptopservice.retrieveAll(username);
		model.addAttribute("laptops", laptops);
		return "listpage";
	}
	
	@RequestMapping(value="/addlist", method=RequestMethod.POST)
	public String addtoTDL(@RequestParam String bench,@RequestParam String model,@RequestParam int price,
			@RequestParam String description,@RequestParam String picture,ModelMap modelmap) {
		
		//String user=(String) modelmap.get("username");
		laptopservice.addLaptop( bench, model,description, price,picture);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/droplist", method=RequestMethod.GET)
	public String deletefromLp(@RequestParam int id, ModelMap model) {
		laptopservice.deleteLaptop(id);
		model.clear();
		return "redirect:/list";
	}
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String showUpdateForm(@RequestParam String description,ModelMap model,@RequestParam int id) {
		model.addAttribute("laptop",laptopservice.findById(id));
		model.addAttribute("previous_id", id);
		return "addTDLextention";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String showadd(@Valid Laptop laptop, ModelMap model, @RequestParam int previous_id) {
		
		
//		if(result.hasErrors()) {
//			return "/updateForm";
//		}
		
		laptopservice.update(previous_id,laptop.getDescription(),laptop.getPicture(), laptop.getPrice());
		model.clear();
		return "redirect:/list";
	}
	
}