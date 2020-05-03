/**
 * 
 */
package com.neeraj.nvpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neeraj
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners() {
		return "owners/ownerindex";
	}
}
