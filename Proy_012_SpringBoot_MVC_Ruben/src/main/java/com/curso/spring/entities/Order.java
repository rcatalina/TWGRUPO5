package com.curso.spring.entities;

import java.util.Objects;
import java.util.UUID;

public class Order {

	private String id;
	private String title;
	private Double totalPrice;

	public Order(String title, Double totalPrice) {
		super();
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", title=" + title + ", totalPrice=" + totalPrice + "]";
	}

}
