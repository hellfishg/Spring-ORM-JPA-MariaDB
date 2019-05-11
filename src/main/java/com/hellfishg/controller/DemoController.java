package com.hellfishg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellfishg.model.Persona;
import com.hellfishg.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(
			@RequestParam(name="name", required=false, defaultValue="pepe") 
			String name,
			Model model) {
		
		Persona p= new Persona();//TODO: inyectar la dependencia.
		p.setId(1);
		p.setName("german");
		
		repo.save(p);
		
		model.addAttribute("name", name);
		
		System.out.println("Yeah babe!");
		
		return null;
	}
}
