package com.curso.domain.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.curso.domain.entities.Developer;
import com.curso.domain.entities.TeamLeader;

@Configuration
@ComponentScan(basePackages = "com.curso.domain.entities")
@ImportResource("classpath:mis-beans.xml")
public class ConfigBeans {

	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TeamLeader leader1() {
		return new TeamLeader();
	}

	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Developer developer1() {
		return new Developer();
	}

}
