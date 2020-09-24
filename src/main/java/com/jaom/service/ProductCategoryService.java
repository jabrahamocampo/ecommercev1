package com.jaom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaom.entity.ProductCategories;
import com.jaom.repository.ProductCategoryRepository;

@Service
@Transactional
public class ProductCategoryService {
	
	@Autowired
	ProductCategoryRepository prodCatService;
	
	public List<ProductCategories> listAll(){
		return (List<ProductCategories>) prodCatService.findAll();
	}
	
}
