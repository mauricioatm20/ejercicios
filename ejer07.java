package com.CursoJava.Introduccion.Ejercicios;
import java.util.Scanner;

public class ejer07 {
/*Dado un número entero n positivo, imprimir su factorial.
0! = 1,  1! = 1,  2! = 2x1 = 2 3! = 3x2x1 = 6 4! = 4x3x2x1 = 24 5! = 120*/
	
	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa un número entero positivo: ");
		int numero = teclado.nextInt();
		     
		int factorial=1;

		if (numero == 0) {
			System.out.println("El factorial de 0 es 1.");
		} 
		else {
			for (int i = 1; i <= numero; i++) {
	            factorial *= i;
		        }
			System.out.println(numero + "! = " + factorial);
		}

	}

}
