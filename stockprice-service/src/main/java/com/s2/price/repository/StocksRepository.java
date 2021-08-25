package com.s2.price.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.s2.price.model.Stocks;

/**
 * Repository used for storing stock details in MongoDb
 */

public interface StocksRepository extends MongoRepository<Stocks, Integer> {


}
