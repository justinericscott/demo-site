package com.itfgfirm.dot.stb.third_party_site_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping(path = {"/"}, method = {RequestMethod.GET})
	public String index() {
		return "Hello World!";
	}
}