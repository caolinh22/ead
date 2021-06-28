package com.example.ead.dto;

import com.example.ead.entity.Sale;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class SaleDTO {
    private int id;
    private String salesmanName;
    private Set<ProductDTO> product;

    public SaleDTO(Sale sale) {
        this.id = sale.getId();
        this.salesmanName = sale.getSalesmanName();
        this.product = sale.getProduct().stream().map(item -> new ProductDTO(item)).collect(Collectors.toSet());
    }
}
