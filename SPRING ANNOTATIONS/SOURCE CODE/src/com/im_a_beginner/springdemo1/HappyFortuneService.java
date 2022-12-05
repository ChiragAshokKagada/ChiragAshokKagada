package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune Service - Today is your best day";
	}
}