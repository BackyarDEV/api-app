package com.backyardev.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppController {

	@GetMapping(value = "/get-payload")
	String getPayload() {
		return "payload";
	}

	@GetMapping(value = "/get-big-payload")
	String getBigPayload() {
		return "big payload";
	}
}
