package com.niit.OnlineShoppingBackend.dao;

import java.util.List;

import com.niit.OnlineShoppingBackend.model.Supplier;

public interface SupplierDAO {
	List<Supplier> allSuppliers();

	Supplier getSupplierById(String id);

	boolean save(Supplier Supplier);

	boolean update(Supplier Supplier);

	boolean delete(Supplier Supplier);
}