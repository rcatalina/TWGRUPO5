package com.curso.naipes;

import com.curso.naipes.domain.Carta;
import com.curso.naipes.enums.ModelosCoche;
import com.curso.naipes.enums.Palo;
import com.curso.naipes.enums.ValorCarta;

public class JuegoNaipes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta c1 = new Carta(Palo.BASTOS, ValorCarta.CABALLO);
		Carta c2 = new Carta(Palo.COPAS, ValorCarta.CUATRO);
		Carta c3 = new Carta(Palo.OROS, ValorCarta.SEIS);

		System.out.println(Palo.BASTOS.ordinal());
		System.out.println(ModelosCoche.valueOfLabel("Básico"));
		System.out.println(ModelosCoche.BASICO);
		System.out.println(ModelosCoche.BASICO.label + "\n\n");

		for (Palo palo : Palo.values()) {
			System.out.println(palo);
		}
	}

}
