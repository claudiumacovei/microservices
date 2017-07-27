package org.cars.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping
	public List<String> available() {
		return Arrays.asList("Dacia", "Honda");
	}
}
