package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Sale;
import com.webapp.demo.Repository.Saledao;
@Service
public class SalesServiceimpl implements SalesService {
	@Autowired
	Saledao sale;

	@Override
	public List<Sale> getSales() {
		// TODO Auto-generated method stub
		return sale.findAll();	}

	@Override
	public void setSales(Sale s) {
		sale.save(s);
		
	}

	@Override
	public void editSales(Sale s) {
	sale.save(s);
		
	}

	@Override
	public void deleteSales(int id) {
		sale.deleteById(id);
		
	}
}
