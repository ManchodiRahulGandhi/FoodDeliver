package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    // Custom query methods, e.g., find by city or postal code
}
