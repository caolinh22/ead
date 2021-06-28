package com.example.ead.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Date dateOfManf;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "saleId")
    private Sale sale;
    @Column(insertable = false, updatable = false)
    private int saleId;

    public Product(String name, String description, Date dateOfManf, int price, Sale sale) {
        this.name = name;
        this.description = description;
        this.dateOfManf = dateOfManf;
        this.price = price;
        this.sale = sale;
    }
}
