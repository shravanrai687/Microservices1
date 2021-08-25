package com.s2.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.s2.company.model.Company;


public interface CompanyRepo extends CrudRepository<Company, Long> {

//	 @Query(nativeQuery=true, value="select * from company order by id ASC")
//	 public Collection<Company> findAllCompanies();
	
	
}
