package com.furkanb.form.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.furkanb.form.model.Person;
import com.furkanb.form.service.PersonService;

@Controller
public class MainController {

	@Autowired
	PersonService personService;

	// url
	@RequestMapping("/main")
	public String hello(Model model) {
		model.addAttribute("print", "xyxy");
		// jsp
		return "main";
	}

	@RequestMapping(value = "/form")
	public String newRegistration(ModelMap model) {
		Person person = new Person();
		model.addAttribute("person", person);
		return "formpage";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String saveRegistration(@ModelAttribute("person") @Valid Person person, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		model.addAttribute("name", person.getName());
		model.addAttribute("surname", person.getSurname());

		personService.savePerson(person);
		return "success";
	}

	@RequestMapping(value = "/success")
	public String handlePerson(@RequestParam("name") String pName, @RequestParam("surname") String pSurname,
			Model map) {
		map.addAttribute("name", pName);
		map.addAttribute("surname", pSurname);
		return "success";
	}

	@RequestMapping(value = "/personjson")
	public @ResponseBody Person getPerson() {
		return new Person(1, "json", "json");
	}

}
