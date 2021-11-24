package com.example.demo.dto;

import java.util.List;
import lombok.Data;

enum Category{id,name,};
@Data
public class CategoryDto {
	
	int C_id= Category.id.ordinal();
	String C_name = Category.name.name();
	private List<CategoryItemDto> categories;
}
