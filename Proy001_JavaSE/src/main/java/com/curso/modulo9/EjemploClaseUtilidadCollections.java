package com.curso.modulo9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EjemploClaseUtilidadCollections {

    public static void main(String[] args) {
        System.out.println("\nINTEGER");
        List<String> paises = new LinkedList<String>();
        paises.add("China");
        paises.add("Alemania");
        paises.add("Francia");
        paises.add("Bielorrussia");
        paises.add("Gambia");
        paises.add("España");

        System.out.println("\nSIN ORDENAR");
        for (String pais : paises) {
            System.out.println(pais);

        }

        Collections.sort(paises); // Hace esta operación usando el Comparable/compareTo de la clase String

        System.out.println("\nORDENADO mediante Comparable/compareTo");
        for (String pais : paises) {
            System.out.println(pais);

        }

        Collections.sort(paises, new ComparadorStringOrdenInverso()); // Hace esta operación usando el
                                                                      // Comparator definido en esta clase

        System.out.println("\nORDENADO mediante Comparator (orden inverso)");
        for (String pais : paises) {
            System.out.println(pais);

        }

        System.out.println("\nPUNTOS");
        List<Punto> puntos = new LinkedList<Punto>();
        puntos.add(new Punto(1, 2));
        puntos.add(new Punto(2, 5));
        puntos.add(new Punto(4, 2));
        puntos.add(new Punto(1, 4));
        puntos.add(new Punto(3, 2));
        puntos.add(new Punto(4, 1));
        puntos.add(new Punto(1, 2));
        puntos.add(new Punto(2, 2));

        System.out.println("\nSIN ORDENAR");
        for (Punto punto : puntos)
            System.out.println(punto.toString());

        Collections.sort(puntos); // Hace esta operación usando el Comparable/compareTo de la clase Punto

        System.out.println("\nORDENADO");
        for (Punto punto : puntos)
            System.out.println(punto.toString());

    }

}
