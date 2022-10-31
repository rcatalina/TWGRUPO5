package com.curso.domain.entities;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.curso.domain.services.LoggerService;

@Component
@Lazy
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TeamLeader extends Manager {

	private String projects;
	private String securityPass;
	private int securityLevel;

	@Autowired
	@Qualifier(value = "developer1")
	private IResource resource;

	@Autowired
	private LoggerService loggerService;

	public TeamLeader() {
		super();
	}

	@PostConstruct
	public void onPostConstruct() {
		loggerService.getLogger().info("... instanciando TeamLeader");
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getSecurityPass() {
		return securityPass;
	}

	public void setSecurityPass(String securityPass) {
		this.securityPass = securityPass;
	}

	public int getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(int securityLevel) {
		this.securityLevel = securityLevel;
	}

	@Override
	public void manage() {
		loggerService.getLogger().info("... TeamLeader está gestionando su equipo.");
		loggerService.getLogger().warning("Este jefe de equipo está gestionando el recurso : " + this.resource + ".");
		loggerService.getLogger().severe("Error gordo del copón.");

	}

}
