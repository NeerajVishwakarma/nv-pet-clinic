/**
 * 
 */
package com.neeraj.nvpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neeraj.nvpetclinic.services.OwnerService;

/**
 * @author Neeraj
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerSerive;
	
	public OwnerController(OwnerService ownerSerive) {
		this.ownerSerive = ownerSerive;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerSerive.findAll());
		
		return "owners/ownerindex";
	}
}
