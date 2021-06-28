package com.example.ead.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String salesmanId;
    @OneToMany(mappedBy = "district", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Product> product;
    private String salesmanName;
    private Date DOS;

    public Sale(String salesmanId,String salesmanName, Date DOS) {
        this.salesmanId = salesmanId;
        this.salesmanName = salesmanName;
        this.DOS = DOS;
    }

    public void addProduct(Product product) {
        if(this.product == null){
            this.product = new HashSet<>();
        }
        this.product.add(product);
    }
}
