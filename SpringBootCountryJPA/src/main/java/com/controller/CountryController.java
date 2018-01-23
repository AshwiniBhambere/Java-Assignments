package com.controller;

import com.model.Country;
import com.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/countries")
public class CountryController
{
    @Autowired
    CountryService countryService;

    @GetMapping(produces = "application/json")
    public List<Country> getCountryById()
    {
        return countryService.getAllCountries();
    }

    @GetMapping(value = "/{id}",produces = "application/json")

    public Country getCountryById(@PathVariable int id)
    {
        return  countryService.getCountryById(id);
    }
}
