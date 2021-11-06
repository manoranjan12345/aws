package com.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsApplication2 {

	@RequestMapping
	public String getName() {
		return "Mano Ranjan";
	}
}
