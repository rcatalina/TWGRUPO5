package com.mercado.entities;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 476088963329855848L;

	private Integer id;
	private String descr;
	private double price;

	public Product(Integer id, String descr, double price) {
		super();
		this.id = id;
		this.descr = descr;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
