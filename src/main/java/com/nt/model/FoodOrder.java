package com.nt.model;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "FD2food_order")
@Data
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "customer_address_id", nullable = false)
    private CustomerAddress customerAddress;

    @ManyToOne
    @JoinColumn(name = "order_status_id", nullable = false)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "assigned_driver_id", nullable = false)
    private DeliveryDriver assignedDriver;

    private LocalDateTime orderDatetime;
    private Double deliveryFee;
    private Double totalAmount;
    private LocalDateTime requestedDeliveryDatetime;
    private Integer custDriverRating;
    private Integer custRestaurantRating;

    @OneToMany(mappedBy = "foodOrder")
    private List<OrderMenuItem> orderMenuItems;
}
