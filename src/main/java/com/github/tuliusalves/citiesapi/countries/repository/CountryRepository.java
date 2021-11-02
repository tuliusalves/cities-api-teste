package com.github.tuliusalves.citiesapi.countries.repository;

import com.github.tuliusalves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
