package com.service;

import com.model.Country;
import com.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService
{
    @Autowired
    ICountryRepository iCountryRepository;

    public List<Country> getAllCountries()
    {
        List <Country>listofcountries= iCountryRepository.findAll();
        return listofcountries;
    }

    public Country getCountryById(int id)
    {
        Country country=iCountryRepository.findOne(id);
        return  country;
    }
}
