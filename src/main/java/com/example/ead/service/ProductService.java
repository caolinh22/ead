package com.example.ead.service;

import com.example.ead.dto.ProductDTO;
import com.example.ead.entity.Product;
import com.example.ead.entity.Sale;
import com.example.ead.repository.ProductRepository;
import com.example.ead.repository.SaleRepository;
import com.example.ead.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SaleRepository saleRepository;

    public ProductDTO createProduct(ProductDTO productDTO) {
        Optional<Sale> saleOptional = saleRepository.findById(productDTO.getSaleId());
        Sale currentSale = saleOptional.orElse(null);
        if(currentSale == null) {
            return null;
        }

        Product product = ConvertUtil.convertProductDTOtoProduct(productDTO, currentSale);
        Product saved = productRepository.save(product);
        if(saved == null) {
            return null;
        }
        //covert to dto to return
        return new ProductDTO(saved);
    }
}
