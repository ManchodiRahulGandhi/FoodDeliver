package com.nt.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.FoodOrder;
import com.nt.service.FoodOrderService;

@RestController
@RequestMapping("/api/orders")
public class FoodOrderController {

    @Autowired
    private FoodOrderService foodOrderService;

    @GetMapping
    public List<FoodOrder> getAllOrders() {
        return foodOrderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodOrder> getOrderById(@PathVariable Long id) {
        return foodOrderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FoodOrder> createOrder(@RequestBody FoodOrder foodOrder) {
        FoodOrder createdOrder = foodOrderService.createOrder(foodOrder);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodOrder> updateOrder(@PathVariable Long id, @RequestBody FoodOrder foodOrder) {
        FoodOrder updatedOrder = foodOrderService.updateOrder(id, foodOrder);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        foodOrderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}
