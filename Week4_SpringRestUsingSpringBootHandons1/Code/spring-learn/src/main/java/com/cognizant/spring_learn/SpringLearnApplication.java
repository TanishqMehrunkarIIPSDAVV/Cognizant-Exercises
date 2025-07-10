package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.spring_learn.model.Country;

@SpringBootApplication
public class SpringLearnApplication
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args)
	{
		System.out.println("-------------------------------------------Output Started");
		System.out.println();
		LOGGER.info("Main Started!!!");
		displayCountry();
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println();
		System.out.println("-------------------------------------------Output Ended");
	}

	public static void displayCountry()
	{
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml"))
		{
			Country country = (Country) context.getBean("country", Country.class);
			LOGGER.info("Country : {}", country.toString());
		}
	}
}
