package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    // Custom query methods if needed
}
