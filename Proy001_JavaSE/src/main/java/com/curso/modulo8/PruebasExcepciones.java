package com.curso.modulo8;

public class PruebasExcepciones {

    private PruebasExcepciones() {

    }

    public static void main(String[] args) {
        int result = doble("22");
        System.out.println("El doble de 22 es " + result + ".");

    }

    public static int doble(String num) {
        int numeroInicial = Integer.parseInt(num);
        return numeroInicial * 2;

    }

}
