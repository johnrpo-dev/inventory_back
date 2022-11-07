package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();

}
