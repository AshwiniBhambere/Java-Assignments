package com.bean;

import java.util.ArrayList;
import java.util.List;

public class  Country
{
    private int id;
    private String countryName;
    List <Country> list=new ArrayList<Country>();
    public Country(int id, String countryName)
    {
        this.id = id;
        this.countryName = countryName;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
}