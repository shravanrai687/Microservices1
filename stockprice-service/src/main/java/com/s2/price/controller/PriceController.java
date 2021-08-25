package com.s2.price.controller;


import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s2.price.model.Stock;
import com.s2.price.repository.StockRepository;

import com.s2.price.service.SequenceGeneratorService;
import com.s2.price.service.StockService;

@RestController
public class PriceController {
	@Autowired
	StockService stockService;
	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	@GetMapping("hello")
    public String hello() {
        return "hello world!!";
    }
	
	@PostMapping("addstock")
	public String toAddStocks(@RequestBody Stock stock)
	{
		
		stock.setId(sequenceGeneratorService.getSequenceNumber(stock.SEQUENCE_NAME));
		
		stockRepository.save(stock);
		return "A stock is added"; 
		
	}
	
	@GetMapping("stockPrice")
    public List<Stock> fetchStockPrice() {
        
		return stockRepository.findAll();
				
}
	
	
	@GetMapping("stockByNameAndDateRange/{name}/{startdate}/{enddate}")
	public List<Stock> getStocksByCompanynameDateRange(@PathVariable("name") String name ,@PathVariable("startdate")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startdate, @PathVariable("enddate")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date enddate) 
	{
		return stockService.getByCompanynameAndDate(name,startdate,enddate);
		
	}
	
}
