package com.example.jpicazo.springbook_di.services;

import java.util.List;

import com.example.jpicazo.springbook_di.models.Products;

public interface ProductService {
    List<Products> findAll();

    Products findById(Long id);

}
