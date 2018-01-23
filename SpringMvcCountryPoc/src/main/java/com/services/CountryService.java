package com.services;

import com.bean.Country;
import com.utility.Countries;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class CountryService
{
    Countries countries=new Countries();

    public List getcontries()
    {
        List <Country>listOfCountries=countries.createCountryList();
        return  listOfCountries;
    }

    public Country getCountryById(int id)
    {

        List <Country>listOfCountries=countries.createCountryList();
        for(Country country:listOfCountries)
        {
            if(country.getId()==id)
                return  country;
        }
        return null;
    }
}
