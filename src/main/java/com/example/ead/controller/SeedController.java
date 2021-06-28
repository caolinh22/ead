package com.example.ead.controller;

import com.example.ead.entity.Product;
import com.example.ead.entity.Sale;
import com.example.ead.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    private SaleRepository saleRepository;

    private static ArrayList<Sale> listSale = new ArrayList<>();
    @RequestMapping(method = RequestMethod.GET)
    public String Seeding() {
        saleRepository.deleteAll();

        Sale sale1 = new Sale();
        sale1.addProduct(new Product("Keyboard", "lofee", new Date(), 100, sale1));
        sale1.addProduct(new Product("Macbook", "23inch 2018", new Date(), 30000, sale1));
        listSale.add(sale1);

        Sale sale2 = new Sale();
        sale2.addProduct(new Product("Keyboard", "AKKO", new Date(), 1020, sale2));
        sale2.addProduct(new Product("Dell", "27inch", new Date(), 400, sale2));
        listSale.add(sale2);

        Sale sale3 = new Sale();
        sale3.addProduct(new Product("Keyboard", "Logitech K200 USB Media Keyboard", new Date(), 1000, sale3));
        sale3.addProduct(new Product("Macbook Air", "23inch 2018", new Date(), 30000, sale3));
        listSale.add(sale3);

        Sale sale4 = new Sale();
        sale4.addProduct(new Product("Keyboard", "EDRA EK384W", new Date(), 1000, sale4));
        sale4.addProduct(new Product("Macbook Pro", "25inch 2021", new Date(), 30000, sale4));
        listSale.add(sale4);

        Sale sale5 = new Sale();
        sale5.addProduct(new Product("Keyboard", "Havit Mechanical Keyboard", new Date(), 200, sale5));
        sale5.addProduct(new Product("Macbook", "23inch 2019", new Date(), 30000, sale5));
        listSale.add(sale5);

        Sale sale6 = new Sale();
        sale6.addProduct(new Product("Keyboard", "Logitech MX Keys Wireless Keyboard", new Date(), 1000, sale6));
        sale6.addProduct(new Product("Macbook Pro", "23inch 2015", new Date(), 30000, sale6));
        listSale.add(sale6);

        Sale sale7 = new Sale();
        sale7.addProduct(new Product("Keyboard", "Apple Magic Keyboard with Numeric MQ052", new Date(), 400, sale7));
        sale7.addProduct(new Product("Asus", "23inch", new Date(), 30000, sale7));
        listSale.add(sale7);

        Sale sale8 = new Sale();
        sale8.addProduct(new Product("Keyboard", "Genius Luxemate 100", new Date(), 1500, sale8));
        sale8.addProduct(new Product("Macbook", "23inch 2018", new Date(), 30000, sale8));
        listSale.add(sale8);

        Sale sale9 = new Sale();
        sale9.addProduct(new Product("Keyboard", "EDRA EK384W - (Gateron switch)", new Date(), 1200, sale9));
        sale9.addProduct(new Product("Macbook", "23inch 2018", new Date(), 30000, sale9));
        listSale.add(sale9);

        Sale sale10 = new Sale();
        sale10.addProduct(new Product("Keyboard", "AKKO 3108 Dragon Ball Z-Goku-Cherry MX Brow", new Date(), 1200, sale10));
        sale10.addProduct(new Product("Macbook", "23inch 2018", new Date(), 30000, sale10));
        listSale.add(sale10);
        Sale sale11 = new Sale();
        sale11.addProduct(new Product("Keyboard", "AKKO 3108 Dragon Ball Z-Goku-Cherry MX Brow", new Date(), 1300, sale11));
        sale11.addProduct(new Product("Macbook", "23inch 2018", new Date(), 30000, sale11));
        listSale.add(sale11);

        for (Sale dis :
                listSale) {
            saleRepository.save(dis);
        }
        return "Seeding Done!";
    }}