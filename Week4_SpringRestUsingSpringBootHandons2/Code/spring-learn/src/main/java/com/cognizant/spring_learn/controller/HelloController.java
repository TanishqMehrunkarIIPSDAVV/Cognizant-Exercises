package com.cognizant.spring_learn.controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController
{
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String sayHello()
    {
        logger.info("sayHello() Started");
        logger.info("sayHello() Ended");
        return "Hello World!!";
    }
}