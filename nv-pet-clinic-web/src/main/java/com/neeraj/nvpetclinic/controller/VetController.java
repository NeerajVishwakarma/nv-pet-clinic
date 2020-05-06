/**
 * 
 */
package com.neeraj.nvpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neeraj.nvpetclinic.services.VetService;

/**
 * @author Neeraj
 *
 */
@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}



	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/vetindex";
	}
}
