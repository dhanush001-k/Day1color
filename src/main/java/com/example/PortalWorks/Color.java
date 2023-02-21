package com.example.PortalWorks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	@RequestMapping("/Color")
	public String Color() {
		String yourFavcolor="Sky Blue";
		return "My favorite color is "+yourFavcolor+"!";
	}

}
