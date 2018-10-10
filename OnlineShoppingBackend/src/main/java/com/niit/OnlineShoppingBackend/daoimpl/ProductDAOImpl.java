package com.niit.OnlineShoppingBackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.niit.OnlineShoppingBackend.dao.ProductDAO;
import com.niit.OnlineShoppingBackend.model.Product;

@ComponentScan("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Product> allProducts() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Product");
		return query.list();
	}

	@Override
	public Product getProductById(String id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public boolean save(Product product) {
		try {
			if (getProductById(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product product) {
		try {
			if (getProductById(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().update(product);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(Product product) {
		try {
			if (getProductById(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}