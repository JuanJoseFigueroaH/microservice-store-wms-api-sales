package com.microservice.store.wms.api.sales.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservice.store.wms.api.sales.model.Sale;
import com.microservice.store.wms.api.sales.repository.SaleRepository;

@Service
public class SaleServicelmpl implements SaleService {
	@Autowired
	private SaleRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Sale> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Iterable<Sale> findIdStoreAndDate(Long storeId, String date){
		return repository.findIdStoreAndDate(storeId, date);
	}
}
