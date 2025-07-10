package com.cognizant.spring_learn.model;
import org.slf4j.*;

public class Country
{
    private String code;
    private String name;
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public Country()
    {
        LOGGER.info("Inside Country Constructor");
    }

    public String getCode()
    {
        LOGGER.info("Inside Getter of Code!!!");
        return this.code;
    }

    public void setCode(String code)
    {
        LOGGER.info("Inside Setter of Code!!!");
        this.code = code;
    }

    public String getName()
    {
        LOGGER.info("Inside Getter of Name!!!");
        return this.name;
    }

    public void setName(String name)
    {
        LOGGER.info("Inside Setter of Name!!!");
        this.name = name;
    }
}