package com.nt.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.FoodOrder;
import com.nt.repo.FoodOrderRepository;

@Service
public class FoodOrderService {
    
    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public List<FoodOrder> getAllOrders() {
        return foodOrderRepository.findAll();
    }

    public Optional<FoodOrder> getOrderById(Long id) {
        return foodOrderRepository.findById(id);
    }

    public FoodOrder createOrder(FoodOrder foodOrder) {
        return foodOrderRepository.save(foodOrder);
    }

    public FoodOrder updateOrder(Long id, FoodOrder foodOrder) {
        foodOrder.setId(id);
        return foodOrderRepository.save(foodOrder);
    }

    public void deleteOrder(Long id) {
        foodOrderRepository.deleteById(id);
    }
}
