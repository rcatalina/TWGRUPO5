package com.curso.jpa.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS", schema = "HR")
public class Trabajo implements Serializable {

	private static final long serialVersionUID = 1L;

	// atributos
	@Id
	@Column(name = "JOB_ID")
	private String id;
	@Column(name = "JOB_TITLE")
	private String title;
	@Column(name = "MIN_SALARY")
	private Double minSalary;
	@Column(name = "MAX_SALARY")
	private Double maxSalary;

	public Trabajo() {
		super();
	}

	public Trabajo(String id, String title, Double minSalary, Double maxSalary) {
		super();
		this.id = id;
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Double minSalary) {
		this.minSalary = minSalary;
	}

	public Double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Trabajo other = (Trabajo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", title=" + title + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}

}
