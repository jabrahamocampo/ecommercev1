package com.jaom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jaom.entity.Products;

public interface ProductRepository extends CrudRepository<Products, Long> {
	@Query(value = "SELECT c FROM Products c WHERE c.productName LIKE '%' || :keyword || '%'"
            + " OR c.productCartDesc LIKE '%' || :keyword || '%'"
            + " OR c.productShortDesc LIKE '%' || :keyword || '%'")
    public List<Products> search(@Param("keyword") String keyword);
}
