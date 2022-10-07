/**
 * 
 */
package com.tresenraya.domain;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Alumno
 *
 */
public class TresEnRayaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {
		// entrada de datos
		TresEnRaya juego = new TresEnRaya();

		int num1 = 2;
		int num2 = 2;

		// resultado esperado
		int expected = 4;

		// resultado real
		int actual = juego.suma(num1, num2);

		// comparamos y si no coinciden, falla el test
		assert expected == actual : "La suma no es correcta.";

		// esto y la línea de arriba es exactamente lo mismo
//		if (expected != actual)
//			fail("La suma no es correcta.");
	}

	@Test(expected = RuntimeException.class)
	public void testPonerFichaEnCoordenada() {
		// falla si no lanza un RuntimeException
		TresEnRaya juego = new TresEnRaya();

		// 3 fila y 3 columnas
		juego.jugar(2, 4);

	}

	@Test(expected = RuntimeException.class)
	public void ponerFichaEnPosicionQueYaHayOtraLanzaUnaExcepcion() {
		TresEnRaya juego = new TresEnRaya();

		juego.jugar(1, 1);
		juego.jugar(1, 1);
	}

	@Test
	public void ponerFichaEnPosicionXYBienEsperaQueEsaPosicionEnElTableroInserteFicha() {
		TresEnRaya juego = new TresEnRaya();

		int x = 1;
		int y = 1;

		juego.jugar(x, y);

		if (juego.verFicha(x, y) == null)
			fail("No se ha insertado la ficha en la posición del tablero.");

	}

	@Test
	public void jugarAvanzaElTurno() {
		TresEnRaya juego = new TresEnRaya();

		int turno1 = juego.verTurno();
		juego.jugar(1, 1);
		int turno2 = juego.verTurno();

		assert turno1 < turno2 : "No se ha avanzado el turno al colocar una ficha en el tablero.";
	}

	@Test
	public void simboloDeFichaNoCoincideConTurnoImpar() {
		TresEnRaya juego = new TresEnRaya();
		int x = 1;
		int y = 1;

		Character expected = juego.getPlayerOneSymbol();

		juego.jugar(x, y);

		Character actual = juego.verFicha(x, y);

		assert expected == actual : "El símbolo de la ficha debería ser " + expected + ".";
	}

	@Test
	public void simboloDeFichaNoCoincideConTurnoPar() {
		TresEnRaya juego = new TresEnRaya();
		int x1 = 1;
		int y1 = 1;

		int x2 = 2;
		int y2 = 2;

		Character expected = juego.getPlayerTwoSymbol();

		juego.jugar(x1, y1);
		juego.jugar(x2, y2);

		Character actual = juego.verFicha(x2, y2);

		assert expected == actual : "El símbolo de la ficha debería ser " + expected + ".";
	}

	@Test
	public void cuandoHayTresPosicionesHorizontalesConElMismoSimboloHayGanador() {
		TresEnRaya juego = new TresEnRaya();

		juego.jugar(0, 0);
		juego.jugar(1, 0);
		juego.jugar(0, 1);
		juego.jugar(1, 1);
		juego.jugar(0, 2);

		Character actual = juego.getGanador();

		if (actual == null)
			fail("Hay un ganador pero no se ha registrado.");

	}

	@Test
	public void cuandoHayTresPosicionesVerticalesConElMismoSimboloHayGanador() {
		TresEnRaya juego = new TresEnRaya();

		juego.jugar(0, 0);
		juego.jugar(0, 1);
		juego.jugar(1, 0);
		juego.jugar(0, 2);
		juego.jugar(2, 0);

		Character actual = juego.getGanador();

		if (actual == null)
			fail("Hay un ganador pero no se ha registrado.");

	}

}
