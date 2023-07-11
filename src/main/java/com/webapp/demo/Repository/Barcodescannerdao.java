package com.webapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.demo.Model.BarcodeScanner;

public interface Barcodescannerdao extends JpaRepository<BarcodeScanner, Integer> {

}
