package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer16 {
/*Escribir un programa que pida al usuario un número entero positivo mayor que 2 y 
muestre por pantalla si es un número primo o no.*/
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Ingresa un número entero positivo mayor que 2: ");
        int numero = teclado.nextInt();

        boolean esPrimo = true;
        
        for (int i = 2; i < numero; i++) {
        	if (numero % i == 0) {
        		esPrimo = false;
        		break;
             }
        }

        if (esPrimo) {
        	System.out.println(numero + " es un número primo.");
        	
        } else {
        	System.out.println(numero + " no es un número primo.");
        }
		
	}

}
