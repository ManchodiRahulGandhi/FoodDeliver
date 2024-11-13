package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.OrderMenuItem;

@Repository
public interface OrderMenuItemRepository extends JpaRepository<OrderMenuItem, Long> {
    // Custom query methods if needed
}
