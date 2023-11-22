package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       //Polimorfismo
        Map tabla = new HashMap();
        tabla.put("12345678A","Juan Lopez");
        System.out.println(tabla);
        tabla.put("12345678B","Laura Flores");
        System.out.println(tabla);
        tabla.put(5,3);

        System.out.println("Obtener el nombre del DNI 12345678A ->"+ tabla.get("12345678A"));
        System.out.println("Obtener el nombre del DNI 12345678B ->"+ tabla.get("12345678B"));

        System.out.println(tabla.values());
        System.out.println(tabla.keySet());
        System.out.println(tabla.entrySet());
    }
}