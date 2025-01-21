package com.example.jpicazo.springbook_di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.jpicazo.springbook_di.models.Products;
import com.example.jpicazo.springbook_di.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repositrory = new ProductRepository();

    public List<Products> findAll() {
        return repositrory.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            Products newProd = (Products) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    public Products findById(Long id) {
        return repositrory.findById(id);
    }
}
