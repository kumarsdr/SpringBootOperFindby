package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	
	List<Product> findByProdCodeOrProdCostLessThan(String prodCode, Double prodCost);

	List<Product> findByProdCodeIsNotNull();

	List<Product> findByProdCodeIn(List<String> codes);

	List<Product> findByProdCostOrProdCode(Double prodCost, String prodCode);

	List<Product> findByProdCostOrderByProdCodeDesc(Double prodCost);


}
