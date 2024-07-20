/*
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
 */
package com.mycompany.recursos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursos {

    private static final Scanner scanner = new Scanner(System.in);

    // Codigo para mostrar el primer  método
    public String mensajePOO() {
        return "PRIMER MÉTODO:Programación Orientada a Objetos 2021";
    }

    // Codigo para mostrar el segundo  método
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

     // Codigo para mostrar el tercer  método
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Codigo para mostrar el cuaarto  método
    public List<Integer> listaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // El propósito de esto es garantizar que los caracteres especiales y acentuados,
        //que están fuera del conjunto ASCII básico, puedan mostrarse correctamente en la consola
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
        }

        // Aqui solicitamos al usuario que ingrese los cuatro metodos
        System.out.println(recursos.mensajePOO());

        System.out.println("SEGUNDO MÉTODO");
        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("TERCER MÉTODO");
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("CUARTO MÉTODO");
        System.out.println("Ingrese hasta qué número de lista quiere retornar:");
        int x = scanner.nextInt();

        // Llamadas a los métodos con los valores ingresados por el usuario
        System.out.println("===========================");
        System.out.println("Resultado de los cutro métodos");
        System.out.println("===========================");
        System.out.println("Programación Orientada a Objetos 2021");
        System.out.println("===========================");
        System.out.println("Verificación de edad del usuario: " + recursos.verificarEdad(edad));
         System.out.println("===========================");
        System.out.println("Resultado de la multiplicación: " + recursos.multiplicacion(num1, num2));
        System.out.println("===========================");
        System.out.println("Lista de números a retornar hasta " + x + ": " + recursos.listaNumeros(x));
    }
}