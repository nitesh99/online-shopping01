package com.sig.shoppingbackend.dao;

import java.util.List;

import com.sig.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list(); 
	Category get(int id);
}
