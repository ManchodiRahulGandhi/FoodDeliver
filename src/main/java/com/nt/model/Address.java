//Address.java
package com.nt.model;

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
@Table(name = "FD2address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unitNumber;
    private String streetNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String region;
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @OneToMany(mappedBy = "address")
    private List<Restaurant> restaurants;

    @OneToMany(mappedBy = "address")
    private List<CustomerAddress> customerAddresses;
}
