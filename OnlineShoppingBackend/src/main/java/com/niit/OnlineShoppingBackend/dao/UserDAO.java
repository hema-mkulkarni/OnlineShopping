package com.niit.OnlineShoppingBackend.dao;

import java.util.List;

import com.niit.OnlineShoppingBackend.model.User;

public interface UserDAO {
	List<User> allUsers();

	User getUserById(String id);

	boolean save(User User);

	boolean update(User User);

	boolean delete(User User);
}
