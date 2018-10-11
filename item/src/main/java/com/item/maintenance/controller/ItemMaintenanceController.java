package com.item.maintenance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.item.maintenance.entity.Product;
import com.item.maintenance.service.ProductCatalogServiceImpl;

@RestController
public class ItemMaintenanceController {

	@GetMapping("getProductDetails")
	@ResponseBody
	public Product getProductDetails(@RequestParam("productId") String productId)
			throws NumberFormatException, Exception {

		if (null != productId) {
			ProductCatalogServiceImpl productCatalogServiceImpl = new ProductCatalogServiceImpl();

			Product product = productCatalogServiceImpl.getProductById(Integer.valueOf(productId));

			return product;
		}
		return null;
	}

	@PostMapping("updateProduct")
	@ResponseBody
	public Product updateProduct(@RequestBody Product product) {
		
		if (null != product) {
			
			product.setName(product.getName()+" #appended");
			return product;
		}
		
		return null;
	}

}
