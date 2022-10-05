package com.maqExp.domain;

import java.util.UUID;

public class Soda {

	private String iD;
	private Long price;
	private String flavour;
	private int cl;
	private boolean isSoldOut;

	public Soda(Long price, String flavour, int cl, boolean isSoldOut) {
		super();
		this.iD = UUID.randomUUID().toString();
		this.price = price;
		this.flavour = flavour;
		this.cl = cl;
		this.isSoldOut = isSoldOut;
	}

	public String getiD() {
		return iD;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getCl() {
		return cl;
	}

	public void setCl(int cl) {
		this.cl = cl;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

}
