package com.services;

import com.bean.Country;
import com.utility.Countries;
import java.util.List;

public class CountryService
{
    Countries countries = new Countries();

    public List<Country> getAllCountries()
    {
        List <Country>listofcountries=countries.createCountryList();
        return  listofcountries;
    }

    public Country getCountryById(int id)
    {
        List<Country>listofcountries=countries.createCountryList();
        for(Country country:listofcountries)
        {
            if(country.getId()==id)
                return country;
        }
        return  null;
    }
}
