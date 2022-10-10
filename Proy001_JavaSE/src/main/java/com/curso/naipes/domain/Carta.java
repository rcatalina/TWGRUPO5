package com.curso.naipes.domain;

import com.curso.naipes.enums.Palo;
import com.curso.naipes.enums.ValorCarta;

public class Carta {

	private Palo palo;
	private ValorCarta valor;

	public Carta(Palo palo, ValorCarta valor) {
		super();
		this.palo = palo;
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public ValorCarta getValor() {
		return valor;
	}

}
