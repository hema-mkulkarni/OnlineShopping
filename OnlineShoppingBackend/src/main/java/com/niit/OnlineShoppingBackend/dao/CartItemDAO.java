package com.niit.OnlineShoppingBackend.dao;

import java.util.List;

import com.niit.OnlineShoppingBackend.model.CartItem;

public interface CartItemDAO {
	List<CartItem> allCartItems();

	CartItem getCartItemById(String id);

	boolean save(CartItem CartItem);

	boolean update(CartItem CartItem);

	boolean delete(CartItem CartItem);
}