package com.curso.modulo8equals;

public class PruebasEquals {

    public static void main(String[] args) {
        // comparacion entre objetos
        Cliente c1 = new Cliente("abc", "Ruben");
        Cliente c2 = new Cliente("abc", "Ruben");

        System.out.println(c1.equals(c2));
//      nunca va a ser true porque son dos objetos distintos en memoria, y 
//      el metodo equals() de Object compara usando == 

        int[][] arr = new int[2][4];
        arr[0] = new int[] { 1, 1, 1, 1 };
        arr[1] = new int[] { 1, 1 };
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2 +" ");
            }
        }

    }

}
