package com.jaom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaom.entity.Products;
import com.jaom.repository.ProductRepository;

@Service
@Transactional
public class ProductsService {
	
	@Autowired
	ProductRepository prodService;
	
	public List<Products> listAll(){
		return (List<Products>) prodService.findAll();
	}
	
	public void save(Products newProduct) {
		prodService.save(newProduct);
	}
	
	public Products get(Long id) {
		return prodService.findById(id).get();
	}
	
	public void delete(Long id) {
		prodService.deleteById(id);
	}
	
	public List<Products> search(String keyword){
		return prodService.search(keyword);
	}

}
