package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods (e.g., find by name) can be added here
}
