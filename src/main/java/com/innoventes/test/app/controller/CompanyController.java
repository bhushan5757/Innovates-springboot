package com.innoventes.test.app.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.innoventes.test.app.entity.Company;
import com.innoventes.test.app.service.CompanyService;

@RestController
@RequestMapping("/api")
public class CompanyController {

	@Autowired
	private CompanyService compServ;

	@GetMapping("/api/{id}")
	public ResponseEntity<Optional<Company>> getById(@PathVariable("id") Integer id) {
		Optional<Company> co = compServ.getById(id);
		return ResponseEntity.ok().body(co);
	}
	@GetMapping("/api/{Url}")
	public ResponseEntity<List<Company>> getById(@PathVariable("url") String webSiteURL) {
	List<Company> cp= compServ.getAllCompanies(webSiteURL);
		return ResponseEntity.ok().body(cp);
	}

}
