package com.curso.domain.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.domain.services.LoggerService;

@Component
public class Developer extends Employee {

	private String category;
	private String softSkills;

	@Autowired
	private LoggerService loggerService;

	public Developer() {
		super();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSoftSkills() {
		return softSkills;
	}

	public void setSoftSkills(String softSkills) {
		this.softSkills = softSkills;
	}

	@Override
	public void work() {
		loggerService.getLogger().info("... Developer está trabajando.");

	}

}
