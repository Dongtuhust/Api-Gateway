package com.teko.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.teko.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
