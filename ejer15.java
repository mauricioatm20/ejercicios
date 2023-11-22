package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer15 {
/*. Escriba un programa que pida un número entero mayor que cero y que escriba sus 
divisores.*/
	
	
	public static void main(String[] args) {
		Scanner teclado =new Scanner (System.in);
		
		System.out.println("ingrese un numero");
		int numero = teclado.nextInt();
		
		if (numero < 0) {
			System.out.println("no tiene divisores");
		} else {
			System.out.print("Los divisores de " + numero + " son: ");
			for(int i=1; i<numero; i++) {
				
				if (numero % i == 0) {
                    System.out.print(i + " ,");
				}
			}
		}
	}
}