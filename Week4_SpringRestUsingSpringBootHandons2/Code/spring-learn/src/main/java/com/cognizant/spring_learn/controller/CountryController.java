package com.cognizant.spring_learn.controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.*;

@RestController
public class CountryController
{
    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia()
    {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("india.xml"))
        {
            Country country = context.getBean("india",Country.class);
            return country;
        }
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code)
    {
        return countryService.getCountry(code);
    }
}