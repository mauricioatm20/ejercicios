package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer05 {
/*Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.*/
	
	
	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int numero;
		int contador=0;
		
		System.out.println("ingresar un valor");
		numero =teclado.nextInt();
		
			while(numero!=0) {
				if(numero > 0) {
				 contador++;  // contara los numeros introducidos
				}
			 System.out.println("ingresar un valor o '0' para terminar ");
			 numero=teclado.nextInt();
			}
		System.out.println("se han introducido "+contador +" numeros positivos");
	}

}
