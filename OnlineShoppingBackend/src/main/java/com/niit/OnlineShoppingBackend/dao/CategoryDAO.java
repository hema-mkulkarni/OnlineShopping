package com.niit.OnlineShoppingBackend.dao;

import java.util.List;

import com.niit.OnlineShoppingBackend.model.Category;

public interface CategoryDAO {
	List<Category> allCategorys();

	Category getCategoryById(String id);

	boolean save(Category Category);

	boolean update(Category Category);

	boolean delete(Category Category);
}