package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Product;
import com.webapp.demo.Repository.Productdao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	Productdao prodao;
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return prodao.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		prodao.save(product);
		
	}

	@Override
	public void editProduct(Product product) {
		prodao.save(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		prodao.deleteById(id);
		
	}

	@Override
	public int getTotalQuantity() {
		// TODO Auto-generated method stub
		return prodao.getTotalQuantity();
	}

	@Override
	public List<Product> getProductsByQuantityLessThanSix() {
		// TODO Auto-generated method stub
		return prodao.findProductsByQuantityLessThanSix();
	}

}
