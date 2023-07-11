package com.webapp.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.Model.Product;

public interface Productdao extends JpaRepository<Product, Integer> {
	@Query(value = "select * from pro p where p.quantity < 6",nativeQuery = true)
	  List<Product> findProductsByQuantityLessThanSix();
	 @Query("SELECT SUM(p.quantity) FROM Product p")
	    int getTotalQuantity();
}
