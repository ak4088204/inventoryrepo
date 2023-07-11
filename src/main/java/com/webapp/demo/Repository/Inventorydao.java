package com.webapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.Model.Inventory;

public interface Inventorydao extends JpaRepository<Inventory, Integer> {
    @Modifying
    @Transactional
	@Query("delete from Inventory i where i.location=?1")
	void deletebyLocation(String location);

}
