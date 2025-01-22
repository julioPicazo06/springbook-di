package com.example.jpicazo.springbook_di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.jpicazo.springbook_di.models.Products;
import com.example.jpicazo.springbook_di.repositories.ProductRepositoryImp;

public class ProductServiceImp implements ProductService {

    private ProductRepositoryImp repositrory = new ProductRepositoryImp();

    @Override
    public List<Products> findAll() {
        return repositrory.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            Products newProd = (Products) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    @Override
    public Products findById(Long id) {
        return repositrory.findById(id);
    }

}
