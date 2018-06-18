package com.teko.demo.service;

import com.teko.demo.model.Product;

public interface ProductService {
	Iterable<Product> findAll();

    Product findOne(Integer id);

    void save(Product contact);

    void delete(int id);
}
