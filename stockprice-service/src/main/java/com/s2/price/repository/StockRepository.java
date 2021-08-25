package com.s2.price.repository;



import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.stereotype.Repository;
import java.util.Date;
import com.s2.price.model.Stock;

@Repository
public interface StockRepository extends MongoRepository<Stock, Integer> {

	
	@Query("{'date' : { $gt: ?0, $lt: ?1 } }")
	List<Stock> findByDateRange(Date date1, Date date2);

	@Query("{$and:[{'name':?0},{'date' : { $gt: ?1, $lt: ?2 }}] }")
	List<Stock> findByCompanynameAndDate(String name, Date startdate, Date enddate);

}
