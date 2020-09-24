package com.jaom.repository;

import org.springframework.data.repository.CrudRepository;

import com.jaom.entity.ProductCategories;

public interface ProductCategoryRepository extends CrudRepository<ProductCategories, Long> {

}
