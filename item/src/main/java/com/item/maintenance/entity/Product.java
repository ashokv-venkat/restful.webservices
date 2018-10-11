package com.item.maintenance.entity;


public class Product {

	private int id;
    private String name;
    private String category;
    private double cost;
    private double retail;
    public Product() {}
    public Product(int id, String name, String category, double cost, double retail) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.retail = retail;        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getcost() {
        return cost;
    }
    public void setcost(double cost) {
        this.cost = cost;
    }
    public double getretail() {
        return retail;
    }
    public void setretail(double retail) {
        this.retail = retail;
    }
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + "]";
	}
}
