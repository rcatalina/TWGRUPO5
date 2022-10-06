package com.maqexpendedora.test;

import com.maqexpendedora.domain.MaquinaExpendedora;
import com.maqexpendedora.domain.Soda;

public class TestMaquinaExpendedora {

	public static void main(String[] args) {
		try {
			Soda s1 = new Soda(150, "Naranja", 33, 0);
			Soda s2 = new Soda(120, "Limón", 25, 0);

			MaquinaExpendedora maq1 = new MaquinaExpendedora(500L, 0L);

			maq1.reponer(s1, 20);
			maq1.reponer(s2, 20);

			maq1.mostrarInformeVentas();

			maq1.vender(s1);
			maq1.vender(s2);
			maq1.vender(s2);

			maq1.mostrarInformeVentas();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

	}

}
