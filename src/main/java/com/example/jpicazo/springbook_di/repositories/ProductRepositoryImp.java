package com.example.jpicazo.springbook_di.repositories;

import com.example.jpicazo.springbook_di.models.Products;

import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImp implements ProductRepository {

    private List<Products> data;

    public ProductRepositoryImp() {
        this.data = Arrays.asList(
                new Products(1L, "Product 1", 100L),
                new Products(2L, "Product 2", 200L),
                new Products(3L, "Product 3", 300L),
                new Products(4L, "Product 4", 400L),
                new Products(5L, "Product 5", 500L),
                new Products(0, "null", 0),
                new Products(23L, "Product 23", 2300L));
    }

    @Override
    public List<Products> findAll() {
        return data;
    }

    @Override
    public Products findById(Long id) {
        return data.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

}
