package com.tresenraya.domain;

public class TresEnRaya {

	private Character[][] tablero;
	private int turno;
	private Character playerOneSymbol;
	private Character playerTwoSymbol;
	private Character ganador;
	private String ganadorMsg;

	public TresEnRaya() {
		this.tablero = new Character[3][3];
		this.playerOneSymbol = Character.valueOf('O');
		this.playerTwoSymbol = Character.valueOf('X');
	}

	public Character getPlayerOneSymbol() {
		return playerOneSymbol;
	}

	public Character getPlayerTwoSymbol() {
		return playerTwoSymbol;
	}

	public Character getGanador() {
		return ganador;
	}

	public String getGanadorMsg() {
		return ganadorMsg;
	}

	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public void jugar(int x, int y) {
		validateCoordinates(x, y);

		// valida que no haya una pieza en esa posicion
		if (this.tablero[x][y] != null)
			throw new RuntimeException("La ficha no puede colocarse en esa posición, ya existe una pieza en la misma.");

		// Si OK, inserta simbolo en tablero
		ponerFicha(x, y);
		checkForWinner(this.tablero[x][y]);

	}

	public Character verFicha(int x, int y) {
		validateCoordinates(x, y);

		return this.tablero[x][y];
	}

	public int verTurno() {
		return this.turno;
	}

	private void checkForWinner(Character ficha) {
		boolean hasWinner = checkHorizWinCond(ficha) || checkVertWinCond(ficha) || checkDiagonalWinCond(ficha);

		if (hasWinner) {
			this.ganador = ficha;
			return;
		}

		this.turno++;
	}

	private boolean checkHorizWinCond(Character ficha) {
		boolean hasWinner = false;

		// linea horizontal
		for (int i = 0; i < 3; i++) {
			int cont = 0;

			for (int j = 0; j < 3; j++) {
				if (tablero[i][j] != null && tablero[i][j].equals(ficha))
					cont++;
			}

			if (cont == 3) {
				hasWinner = true;
				break;
			}
		}

		return hasWinner;
	}

	private boolean checkVertWinCond(Character ficha) {
		boolean hasWinner = false;

		// linea vertical
		for (int i = 0; i < 3; i++) {
			int cont = 0;

			for (int j = 0; j < 3; j++) {
				if (tablero[j][i] != null && tablero[j][i].equals(ficha))
					cont++;
			}

			if (cont == 3) {
				hasWinner = true;
				break;
			}

		}

		return hasWinner;
	}

	private boolean checkDiagonalWinCond(Character ficha) {
		boolean hasWinner = false;

		// linea diagonal
		int length = this.tablero.length;
		int diagonalLines = (length + length) - 1;
		int midPoint = (diagonalLines / 2) + 1;

		// TODO

		int i = 0;

//		for (int i = 1; i <= diagonalLines; i++) {
//			if (i != midPoint)
//				continue;
//
//			itemsInDiagonal++;
//			for (int j = 0; j < itemsInDiagonal; j++) {
//				rowIndex = (i - j) - 1;
//				columnIndex = j;
//				items.append(twoDArray[rowIndex][columnIndex]);
//
//			}
//		}

		return hasWinner;

	}

	private void ponerFicha(int x, int y) {
		Character symbol = (this.turno % 2 == 0) ? this.playerOneSymbol : this.playerTwoSymbol;

		this.tablero[x][y] = symbol;
	}

	private void validateCoordinates(int x, int y) {
		// valida X
		if (x < 0 || x > 2)
			throw new RuntimeException(
					"La ficha no puede colocarse fuera del tablero de 3x3. Coordenada X incorrecta.");

		// valida Y
		if (y < 0 || y > 2)
			throw new RuntimeException(
					"La ficha no puede colocarse fuera del tablero de 3x3. Coordenada Y incorrecta.");
	}

}
