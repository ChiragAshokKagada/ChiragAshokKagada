package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Service - Today is the best day.";
	}

} 