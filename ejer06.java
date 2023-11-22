package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer06 {
/*Siguiendo la misma metodología de carga, calcular la cantidad de valores >= 0 y la cantidad 
menores que 0.*/
	
	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int numero;
		int positivo =0;
		int negativo =0;
		
		System.out.println("ingrese valores");
		numero = teclado.nextInt();
		
		while(numero!=0) {
			if (numero > 0) {
				positivo++;
			} 
			 else {
				 negativo++;
			 }
			 System.out.println("ingresar un valor o '0' para terminar ");
			 numero=teclado.nextInt();
		}
		System.out.println("se han introducido " + positivo +" numeros positivos");
		System.out.println("se han introducido " + negativo +" numeros positivos");
	}

}
