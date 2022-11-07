package com.example.demo.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseRest extends ResponseRest{
	
	private CategoryResponse categoryResponse = new CategoryResponse();

	public CategoryResponse getCategoryResponse() {
		return categoryResponse;
	}

	public void setCategoryResponse(CategoryResponse categoryResponse) {
		this.categoryResponse = categoryResponse;
	}

	
}
