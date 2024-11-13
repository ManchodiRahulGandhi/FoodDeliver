package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.DeliveryDriver;

@Repository
public interface DeliveryDriverRepository extends JpaRepository<DeliveryDriver, Long> {
    // Custom query methods if needed
}
