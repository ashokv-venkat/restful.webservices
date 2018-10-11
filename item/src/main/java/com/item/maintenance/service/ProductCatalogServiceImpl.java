package com.item.maintenance.service;

import java.util.*;

import com.item.maintenance.entity.Product;

public class ProductCatalogServiceImpl implements ProductCatalogService {
	private static List<Product> productCatalog;

	public ProductCatalogServiceImpl() {
		initializeProductCatalog();
	}

	public Product getProductById(int id) throws Exception {
		for (Product p : productCatalog)
			if (p.getId() == id)
				return p;
		throw new Exception("No product found with id " + id);
	}

	public Product getProductByName(String name) throws Exception {
		for (Product product : productCatalog)
			if (product.getName() == name)
				return product;
		throw new Exception("No product found with name " + name);
	}

	public void setProductById(Product product) {
		productCatalog.add(product);
	}

	public void initializeProductCatalog() {
		// TODO Auto-generated method stub
		if (productCatalog == null) {
			productCatalog = new ArrayList<Product>();
			productCatalog.add(new Product(2018101, "Keyboard", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018102, "Mouse", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018103, "Refrigerator", "Home Appliances", 149.55, 210.20));
			productCatalog.add(new Product(2018104, "Washing Machine", "Home Appliances", 149.55, 210.20));
			productCatalog.add(new Product(2018105, "Casual Shirts", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018106, "T-Shirts", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018107, "Jeans", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018108, "Accessories", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018109, "LCD TV", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018110, "Mobile Phone", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018111, "Formal Shirts", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018112, "Hammer", "Hardware", 149.55, 210.20));
			productCatalog.add(new Product(2018113, "Connect The Dots", "Books", 149.55, 210.20));
			productCatalog.add(new Product(2018114, "LCD Projector", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018115, "Everyone has a Story", "Books", 149.55, 210.20));
			productCatalog.add(new Product(2018116, "The Legend", "Books", 149.55, 210.20));
			productCatalog.add(new Product(2018117, "Love and Peace", "Books", 149.55, 210.20));
			productCatalog.add(new Product(2018118, "Digital Clock", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018119, "LED TV", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018120, "SMART TV", "Electronics", 149.55, 210.20));
			productCatalog.add(new Product(2018121, "Mixer Grinder", "Home Appliances", 149.55, 210.20));
			productCatalog.add(new Product(2018122, "The Lonely Planet", "Books", 149.55, 210.20));
			productCatalog.add(new Product(2018123, "Trousers", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018124, "Shorts", "Fashion", 149.55, 210.20));
			productCatalog.add(new Product(2018125, "Track Wear", "Fashion", 149.55, 210.20));
		}

	}

}