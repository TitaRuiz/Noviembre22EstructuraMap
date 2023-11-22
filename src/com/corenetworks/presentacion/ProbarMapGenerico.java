package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProbarMapGenerico {

    public static void main(String[] args) {

        Map<Integer,String> tablaAlumnos = new HashMap<>();
        tablaAlumnos.put(123,"Juan Lopez");
        tablaAlumnos.put(124,"Laura Flores");
        System.out.println(tablaAlumnos);
        System.out.println("Obtener el nombre de la matricula 123 "+ tablaAlumnos.get(123));
        System.out.println("Obtener el nombre de la matricula 124 "+ tablaAlumnos.get(124));
        System.out.println("Nombre de los alumnos " + tablaAlumnos.values());
        System.out.println("Matriculas " + tablaAlumnos.keySet());
        System.out.println("Todos los datos en un set "+ tablaAlumnos.entrySet());
        //Estructura para almacenar como un diccionario
        //La palabra puede tener varias definiciones
        Map<String, Set<String>> diccionario = new HashMap<>();
        String palabra = "banco";
        Set<String> definiciones = new HashSet<>();
        definiciones.add("mueble para sentarse");
        definiciones.add("Institucion que gestiona dinero");
        definiciones.add("Agrupacion de peces");
        diccionario.put(palabra,definiciones);
        System.out.println("Diccionario " + diccionario);
        Set<String> definiciones2 = new HashSet<>();
        definiciones2.add("Animal mamifero de cuatro patas que da leche");
        diccionario.put("vaca",definiciones2);
        System.out.println(diccionario);
        diccionario.put("a",definiciones2);
        System.out.println(diccionario);
        diccionario.put("z",definiciones2);
        System.out.println(diccionario);


    }
}
