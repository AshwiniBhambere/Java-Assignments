package com.controller;

import com.bean.Country;
import com.services.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="countries")
public class CountryController
{
    CountryService countryService= new CountryService();

    @GetMapping(produces = "application/json")
    public List getCountries()
    {
        return countryService.getAllCountries();
    }

    @GetMapping(value = "/{id}",produces = "application/json")
    public Country getCountryById(@PathVariable int id)
    {
        return countryService.getCountryById(id);

    }
}
