package com.teko.demo.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teko.demo.model.Product;
import com.teko.demo.service.ProductService;

@RestController
@Api(value="product")
public class ProductController {
	@Autowired
    private ProductService productService;

    @ApiOperation(value = "View a list of available product",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Product> list(Model model){
        Iterable<Product> productList = productService.findAll();
        return productList;
    }
    
    @ApiOperation(value = "Search a product with an ID",response = Product.class)
    @RequestMapping(value = "product/{id}", method= RequestMethod.GET, produces = "application/json")
    public Product showProduct(@PathVariable Integer id, Model model){
       Product film = productService.findOne(id);
        return film;
    }

    @ApiOperation(value = "Update a film")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public void updateProduct(@PathVariable Integer id, @RequestBody Product product){
        Product storedProduct = productService.findOne(id);
        storedProduct.setSku(product.getSku());
        storedProduct.setTitle(product.getTitle());
        storedProduct.setCategory(product.getCategory());
        storedProduct.setModijedAt(product.getModijedAt());
        storedProduct.setPrice(product.getPrice());
        productService.save(storedProduct);
    }

    @ApiOperation(value = "Delete a product")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delete(@PathVariable Integer id){
        productService.delete(id);

    }
	
}