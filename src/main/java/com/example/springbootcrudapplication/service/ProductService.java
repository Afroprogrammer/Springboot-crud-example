package com.example.springbootcrudapplication.service;

import com.example.springbootcrudapplication.model.Product;
import com.example.springbootcrudapplication.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll(){
       return  productRepository.findAll();
    }
    public void save(Product product){
        productRepository.save(product);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }

    public Product get(Long id){
        return productRepository.findById(id).get();
    }

}
