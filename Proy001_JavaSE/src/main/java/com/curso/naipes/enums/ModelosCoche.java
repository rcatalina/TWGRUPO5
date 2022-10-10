package com.curso.naipes.enums;

// ENUMS avanzado
public enum ModelosCoche {
	BASICO("Básico"), MEDIO("Medio"), SUPERIOR("Superior");

	public final String label;

	private ModelosCoche(String label) {
		this.label = label;
	}

	public static ModelosCoche valueOfLabel(String label) {
		for (ModelosCoche e : values()) {
			if (e.label.equals(label)) {
				return e;
			}
		}
		return null;
	}
}
