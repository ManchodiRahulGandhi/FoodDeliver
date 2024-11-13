package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.model.FoodOrder;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
    // You can add custom query methods here if needed
	List<FoodOrder> findByOrderStatus_StatusValue(String statusValue);

    @Query("SELECT o FROM FoodOrder o WHERE o.customer.lastName = :lastName")
    List<FoodOrder> findOrdersByCustomerLastName(String lastName);
}
