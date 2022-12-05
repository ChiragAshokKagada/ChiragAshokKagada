package com.im_a_beginner.springdemo;

public class HappyFortuneService1 implements FortuneService1 {
 
	@Override
	public String getFortune() {
		return "Today is your lucky day!";  
	} 
	
}