package com.controller;

import com.bean.Country;
import com.services.CountryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController
{
    CountryService countryService=new CountryService();

    @RequestMapping(value = "/countries" ,method = RequestMethod.GET, produces = "application/json")
    public List getcontries()
    {
       return  countryService.getcontries();
    }

    @RequestMapping(value = "/countries/{id}", method = RequestMethod.GET, produces = "application/json")
    public Country getCountryById(@PathVariable int id)
    {
        return countryService.getCountryById(id);
    }

}
