package com.item.maintenance.service;
import com.item.maintenance.entity.Product;

public interface ProductCatalogService {

	public Product getProductById(int id) throws Exception;

	public Product getProductByName(String name) throws Exception;

	public void initializeProductCatalog();

	public void setProductById(Product product);
}
