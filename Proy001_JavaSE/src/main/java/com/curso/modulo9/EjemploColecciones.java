package com.curso.modulo9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class EjemploColecciones {

    public static void main(String[] args) {

        // @formatter:off

        /*
         * Collection
         *  Set                 NO ADMITE DUPLICADOS
         *      HashSet         -> items sin ordenar
         *      LinkedHashSet   -> items ordenados por orden de insercion
         *      TreeSet         -> items ordenados por orden natural (Comparable/Comparator)
         * 
         *  List                ADMITE DUPLICADOS
         *      ArrayList       -> .add(obj) .
         *      LinkedList      ->
         *      
         *  Queue           
         *  
         * 
         */

        // @formatter:on

        // INTERFACE COLLECTION
        Collection<Object> c = new LinkedHashSet<>();

        // SET
        System.out.println("\nHASHSET");
        Set<String> nombres = new HashSet<>();
        nombres.add("Caawkjdhwad");
        nombres.add("234aadwa");
        nombres.add("adasadklagdawhdsd");
        nombres.add("adawdklmha3ahdsd");
        nombres.add("adjkjsdfhs dfsdahdsd");
        nombres.add("adahdsd");

        for (String nombre : nombres)
            System.out.println(nombre);

        System.out.println("\nLINKEDHASHSET");
        Set<Punto> puntos = new LinkedHashSet<Punto>();
        puntos.add(new Punto(1, 2));
        puntos.add(new Punto(2, 5));
        puntos.add(new Punto(4, 2));
        puntos.add(new Punto(1, 4));
        puntos.add(new Punto(3, 2));
        puntos.add(new Punto(4, 1));
        puntos.add(new Punto(1, 2));
        puntos.add(new Punto(2, 2));

        for (Punto punto : puntos)
            System.out.println(punto.toString());

        System.out.println("\nTREESET");
        Set<Punto> puntos2 = new TreeSet<>();
        puntos2.add(new Punto(1, 2));
        puntos2.add(new Punto(2, 5));
        puntos2.add(new Punto(4, 2));
        puntos2.add(new Punto(1, 4));
        puntos2.add(new Punto(3, 2));
        puntos2.add(new Punto(4, 1));
        puntos2.add(new Punto(1, 2));
        puntos2.add(new Punto(2, 2));

        for (Punto punto : puntos2)
            System.out.println(punto.toString());

        System.out.println("\nTREESET orden inverso con COMPARATOR");
        Set<String> apellidos = new TreeSet<>(new ComparadorStringOrdenInverso());
        apellidos.add("Caawkjdhwad");
        apellidos.add("234aadwa");
        apellidos.add("adasadklagdawhdsd");
        apellidos.add("adawdklmha3ahdsd");
        apellidos.add("adjkjsdfhs dfsdahdsd");
        apellidos.add("adahdsd");

        for (String apellido : apellidos)
            System.out.println(apellido);

        // LIST
        System.out.println("\nARRAYLIST");
        List<String> paises = new ArrayList<>();
        paises.add("China");
        paises.add("Peru");
        paises.add("Gambia");
        paises.add("Francia");
        paises.add(0, "España");

        for (String pais : paises)
            System.out.println(pais);

        // QUEUE
        System.out.println("\nQUEUE");
        PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
        cola.add(23);
        cola.add(1);
        cola.add(5);
        cola.add(590);
        cola.add(4);

        for (Integer i : cola)
            System.out.println(i);

        System.out.println("\nPrimer elemento de la cola (PEEK): " + cola.peek());

        System.out.println("Primer elemento de la cola (POLL): " + cola.poll());
        System.out.println("Primer elemento de la cola (POLL): " + cola.poll());
        System.out.println("Primer elemento de la cola (POLL): " + cola.poll());
        
        for (Integer i : cola)
            System.out.println(i);

        // MAP

        // CLASE UTILIDAD COLLECTIONS Y ARRAYS

        // COLECCIONES GENERICAS

        // COMPARABLE Y COMPARATOR

    }

}
