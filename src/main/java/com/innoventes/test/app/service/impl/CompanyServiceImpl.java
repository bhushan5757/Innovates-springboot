package com.innoventes.test.app.service.impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.test.app.entity.Company;

import com.innoventes.test.app.repository.CompanyRepository;
import com.innoventes.test.app.service.CompanyService;


@Service
public class CompanyServiceImpl implements CompanyService {

@Autowired
private CompanyRepository comprepo;



@Override
public List<Company> getAllCompanies(Company comp) {
	return  (List<Company>) comprepo.findAll();
	
}



@Override
public Optional<Company> getById(Integer comp) {
	Optional<Company> co=	comprepo.findById(comp);
	return co;
}



@Override
public List<Company> getAllCompanies(String webSiteURL) {
	List<Company> cm=comprepo.getAllCompanies(webSiteURL);

	return cm;
}



	


	
}
