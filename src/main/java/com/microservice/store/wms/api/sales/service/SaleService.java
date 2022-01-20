package com.microservice.store.wms.api.sales.service;

import java.util.Date;

import com.microservice.store.wms.api.sales.model.Sale;

public interface SaleService {
	public Iterable<Sale> findAll();
	public Iterable<Sale> findIdStoreAndDate(Long storeId, String date);
}
