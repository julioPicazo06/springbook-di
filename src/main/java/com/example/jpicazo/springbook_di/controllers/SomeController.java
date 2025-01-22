package com.example.jpicazo.springbook_di.controllers;

import com.example.jpicazo.springbook_di.models.Products;
import com.example.jpicazo.springbook_di.services.ProductServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductServiceImp service = new ProductServiceImp();

    @GetMapping("/")
    public List<Products> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Products show(@PathVariable long id) {
        return service.findById(id);
    }
}
