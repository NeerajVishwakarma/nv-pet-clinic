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
@Controller
public class IndexController {

	@RequestMapping({"","/","index","index.html"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/oups")
	public String oupsHandles() {
		return "notimplemented";
	}
}
