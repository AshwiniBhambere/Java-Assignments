package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="country")
public class Country
{
    @Id
    private int id;
    private String name;
   // List<Country> list=new ArrayList<Country>();

    public Country()
    {

    }

    public Country(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setCountryName(String name)
    {
        this.name = name;
    }
}
