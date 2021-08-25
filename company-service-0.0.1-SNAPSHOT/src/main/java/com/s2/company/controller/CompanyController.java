package com.s2.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.s2.company.model.Company;
import com.s2.company.repository.CompanyRepo;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CompanyController {
	
	@Autowired 
	CompanyRepo companyRepo;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloWorld() throws Exception{
		return "Hello World!!";
	}
	
	@RequestMapping(value="/getCompanyDetails", method = RequestMethod.GET)
	public Iterable<Company> completedRide() {
		
		//return (List) companyrepo.findAll();
		//return (List) companyRepo.findAllCompanies();
		return companyRepo.findAll();
	}
	@PostMapping("/addCompany")
	public String toAddCompanies(@RequestBody Company company)
	{
		companyRepo.save(company);
		return "A Company is added";
		
	}
}


