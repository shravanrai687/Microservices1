package com.s2.price.service;

import java.util.Date;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s2.price.model.Stock;
import com.s2.price.repository.StockRepository;



@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;
	
     
	public List<Stock> getByDate(Date sdate,Date edate){ 
	
		return stockRepository.findByDateRange(sdate,edate);
	}


	public List<Stock> getByCompanynameAndDate(String name, Date startdate, Date enddate) {
		
		return stockRepository.findByCompanynameAndDate(name,startdate,enddate) ;
	}
	
}
