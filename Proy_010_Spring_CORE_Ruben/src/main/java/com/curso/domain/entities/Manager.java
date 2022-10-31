package com.curso.domain.entities;

import org.springframework.stereotype.Component;

public abstract class Manager implements IManagement {

	private String region;
	private String country;
	private String team;

	protected Manager() {

	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
