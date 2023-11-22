package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer10 {
/* Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9.*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingresar el numero");
		int numero = teclado.nextInt();
		
		int tabla=1;
		
		System.out.println("la tabala de "+numero );
		
		for(int i=1; i<=9; i++) {
			tabla = numero*i;
		
			System.out.println(numero + "x" +i + "=" + tabla);
		}
		
	}

}
