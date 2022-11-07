package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.CategoryResponseRest;
import com.example.demo.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
public class CategotyRestController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public ResponseEntity <CategoryResponseRest> searchCategories(){
		
		ResponseEntity <CategoryResponseRest> response = service.search();
		return response;
		
	}
}
