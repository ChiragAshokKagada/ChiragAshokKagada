package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

@Component 
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "REST Fortune Service - Today is the best day.";
	}
}