package com.repository;

import com.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository <Country,Integer>
{

}
