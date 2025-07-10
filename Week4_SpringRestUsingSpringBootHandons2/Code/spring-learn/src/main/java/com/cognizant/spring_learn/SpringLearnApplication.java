package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication
{
	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args)
	{
		System.out.println("-------------------------------------------Output Started");
		System.out.println();
		logger.info("Main Started!!!");
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println();
		System.out.println("-------------------------------------------Output Ended");
	}
}
