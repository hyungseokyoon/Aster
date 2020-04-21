package com.Aster.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.internal.EntityManagerMessageLogger;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTJPA")
public class ProductJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCTJPA_ID", nullable = false, unique = true)
    private Long Id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column
    private String description;
    @Column(nullable = false)
    private String florsitEmail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVENTORYJPA_ID")
    private InventoryJpa inventoryJpa;

    public ProductJpa(@JsonProperty("productName") String productName,
                   @JsonProperty("price") double price,
                   @JsonProperty("description") String description,
                   @JsonProperty("floristEmail") String floristEmail) {
        this.name = productName;
        this.price = price;
        this.description = description;
        this.florsitEmail = floristEmail;
    }

    public ProductJpa(){}

    public InventoryJpa getInventory() {
        return inventoryJpa;
    }

    public void setInventory(InventoryJpa inventoryJpa) {
        this.inventoryJpa = inventoryJpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFlorsitEmail() {
        return florsitEmail;
    }

    public void setFlorsitEmail(String florsitEmail) {
        this.florsitEmail = florsitEmail;
    }
}