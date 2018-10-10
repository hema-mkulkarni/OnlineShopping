package com.niit.OnlineShoppingBackend.dao;

import java.util.List;

import com.niit.OnlineShoppingBackend.model.Product;

public interface ProductDAO {
	List<Product> allProducts();

	Product getProductById(String id);

	boolean save(Product product);

	boolean update(Product product);

	boolean delete(Product product);
}