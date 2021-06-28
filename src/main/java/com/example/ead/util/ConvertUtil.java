package com.example.ead.util;

import com.example.ead.dto.ProductDTO;
import com.example.ead.entity.Product;
import com.example.ead.entity.Sale;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtil {
    public static Product convertProductDTOtoProduct(ProductDTO dto, Sale currentSale) {
        Product product  = new Product();
        product.setDescription(dto.getDescription());
        product.setName(dto.getName());
        product.setDateOfManf(dto.getDateOfManf());
        product.setPrice(dto.getPrice());
        product.setSale(currentSale);
        return product;
    }

    public static String convertJavaDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(date);
    }
}
