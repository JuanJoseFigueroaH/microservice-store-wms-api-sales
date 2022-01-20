package com.microservice.store.wms.api.sales.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.microservice.store.wms.api.sales.model.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long> {
	@Query("select sl from Sale as sl where sl.storeId=:storeId and sl.dateSale=:date")
	@Transactional(readOnly=true)
	Iterable<Sale> findIdStoreAndDate(@Param("storeId") Long storeId, @Param("date") String date);
}