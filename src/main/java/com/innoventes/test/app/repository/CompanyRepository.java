package com.innoventes.test.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.test.app.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
	@Query(value = "select * from Company where webSiteURL=?1",nativeQuery=true)

	List<Company> getAllCompanies(String webSiteURL);
}