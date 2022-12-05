package com.im_a_beginner.springdemo1;

public class BestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is the best day of your life.";
	}
} 
