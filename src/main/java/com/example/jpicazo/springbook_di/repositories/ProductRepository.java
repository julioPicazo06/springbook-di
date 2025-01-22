package com.example.jpicazo.springbook_di.repositories;

import java.util.List;

import com.example.jpicazo.springbook_di.models.Products;

public interface ProductRepository {

    List<Products> findAll();

    Products findById(Long id);
}
