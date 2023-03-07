package com.innoventes.test.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.innoventes.test.app.entity.Company;


public interface CompanyService {

	List<Company> getAllCompanies(Company comp);
	public Optional<Company> getById(Integer comp);
	List<Company> getAllCompanies(String webSiteURL);
	
}
