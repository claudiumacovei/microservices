package org.zuulproxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class Controller {

//	@RequestMapping("/")
	public String welcome() {
		return "Welcome to zull proxy!";
	}
}
