package com.sig.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Repository;

import com.sig.shoppingbackend.dao.CategoryDAO;
import com.sig.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	public static List<Category> categories = new ArrayList<>();
	static{
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Description of television!");
		category.setImageURL("CAT-1.png");
		categories.add(category);
		
		//SECOND category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Description of Mobile!");
		category.setImageURL("CAT-2.png");
		categories.add(category);
		
		//Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Description of Laptop!");
		category.setImageURL("CAT-3.png");
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		return categories;
	}
	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories){
			if(category.getId() == id) return category;
		}
		return null;
	}
}
