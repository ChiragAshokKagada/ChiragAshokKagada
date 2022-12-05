package com.im_a_beginner.springdemo1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component 
public class RandomFortuneService implements FortuneService {

	// Create an array of strings
	private String[] data = {
		"The harder you work the luckier you get.",
		"Price of winning is low than the bill of regret.",
		"Winners need discipline not motivation.",
		"Self Belief is more important than other people's opinion.",
		"You should be a risk taker and change you're family's life.",
	};
	
	// Create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune ;
	} 
}