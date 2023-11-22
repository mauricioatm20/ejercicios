package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {

		/*Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por 
teclado.*/
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de numeros");
		int numero = teclado.nextInt();
		
		if(numero <=0) {
			System.out.println("el numero tiene que ser mayor que 0");
		}
		else {
			int suma =0;
			
			for(int i =1; i<numero; i++ ) {
				suma+= i;
			}
			 System.out.println("La suma de los primeros " + numero + " números naturales es: " + suma);
		}
	}

}
