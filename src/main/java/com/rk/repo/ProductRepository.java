package com.rk.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	/*
	 * List<myData> findByProdIdLessThan(Integer id);
	 * 
	 * interface myData { String getProdcode(); Double getProdCost();
	 * 
	 * }
	 */
}
