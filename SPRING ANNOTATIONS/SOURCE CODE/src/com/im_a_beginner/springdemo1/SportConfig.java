package com.im_a_beginner.springdemo1;

import org.springframework.context.annotation.Bean;

//import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.im_a_beginner.springdemo1")
@PropertySource("classpath:sport.properties")
public class SportConfig{
	@Bean
	public FortuneService bestFortuneService(){
		return new BestFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(bestFortuneService());
		return mySwimCoach ;
		}
	 
} 

