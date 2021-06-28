package com.example.ead.dto;

import com.example.ead.entity.Product;
import com.example.ead.entity.Sale;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private Date dateOfManf;
    private int price;
    private int saleId;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.description = product.getDescription();
        this.dateOfManf = product.getDateOfManf();
        this.price = product.getPrice();
        this.name = product.getName();
        if(product.getSale() != null) {
            this.saleId = product.getSale().getId();
        }
    }
}