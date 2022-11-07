package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ICategoryDao;
import com.example.demo.model.Category;
import com.example.demo.response.CategoryResponseRest;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ICategoryDao categoryDao;

	@Override
	@Transactional(readOnly = true)
	public ResponseEntity<CategoryResponseRest> search() {
		
		CategoryResponseRest response = new CategoryResponseRest();
		
		try {
			
			List<Category> category = (List<Category>) categoryDao.findAll();
			
			response.getCategoryResponse().setCategory(category);
			response.setMetadata("Respuesta ok ", "00", "Respuesta Exitosa");
			
		} catch (Exception e) {
			
			response.setMetadata("Respuesta ok ", "-1", "Error en consulta");
			e.getStackTrace();
			return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);
	}

}
