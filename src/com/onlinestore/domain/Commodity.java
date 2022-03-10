package com.onlinestore.domain;

import java.util.ArrayList;
import java.util.List;

public class Commodity {

	private int id;
	private String name;
	private String primaryClassification;
	private String secondClassification;
	private String description;
	private String imgs;
	private double price;
	public Commodity() {
		// TODO Auto-generated constructor stub
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
	public String getPrimaryClassification() {
		return primaryClassification;
	}
	public void setPrimaryClassification(String primaryClassification) {
		this.primaryClassification = primaryClassification;
	}
	public String getSecondClassification() {
		return secondClassification;
	}
	public void setSecondClassification(String secondClassification) {
		this.secondClassification = secondClassification;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
