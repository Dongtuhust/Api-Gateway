package com.teko.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teko.demo.model.Product;
import com.teko.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    private ProductRepository productRepository;
	
	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

//	@Override
//	public List<Product> search(String q) {
//		// TODO Auto-generated method stub
//		return productRepository.findByNameContaining(q);
//	}

	@Override
	public Product findOne(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.getOne(id);
	}

	@Override
	public void save(Product contact) {
		// TODO Auto-generated method stub
		productRepository.save(contact);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		
	}
	
}
