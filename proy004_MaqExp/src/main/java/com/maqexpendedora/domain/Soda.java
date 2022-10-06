package com.maqexpendedora.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Soda {

	private String id;
	private Integer price;
	private String flavour;
	private Integer cl;
	private Integer stock;
	private boolean isSoldOut;

	public Soda(Integer price, String flavour, Integer cl, Integer stock) throws Exception {
		super();

		this.validate(price, flavour, cl, stock);

		this.id = UUID.randomUUID().toString();
		this.price = price;
		this.flavour = flavour;
		this.cl = cl;
		this.stock = stock;

		if (stock > 0)
			this.isSoldOut = false;
		else
			this.isSoldOut = true;
	}

	public String getId() {
		return id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Integer getCl() {
		return cl;
	}

	public void setCl(Integer cl) {
		this.cl = cl;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	private void validate(Integer price, String flavour, Integer cl, Integer stock) throws Exception {
		boolean hasError = false;
		List<String> errorMessages = new LinkedList<>();

		if (price == null || price <= 0) {
			hasError = true;
			errorMessages.add("El precio no puede ser inferior o igual a 0.");
		}

		if (flavour == null || flavour.isBlank()) {
			hasError = true;
			errorMessages.add("El sabor no puede estar vacío.");
		}

		if (cl == null || cl <= 0) {
			hasError = true;
			errorMessages.add("Los centilitros no pueden ser inferiores o iguales a cero.");
		}

		if (stock == null || stock < 0) {
			hasError = true;
			errorMessages.add("El stock no puede ser inferior a 0.");
		}

		if (hasError) {
			String e = "ERROR\n";

			for (String msg : errorMessages) {
				e = e.concat(msg + " ");
			}

			throw new Exception(e);
		}
	}

}
