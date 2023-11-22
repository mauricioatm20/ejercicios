package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer11 {
/*Escribir un programa que imprima las tablas del 1 al 9.*/
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("las tablas de multiplicar ");
		
		int tabla =1;
		
		for(int i=1; i<=9; i++) {
			System.out.println("Tabla del " + i);
			
			  for(int j=1; j<=9; j++){
				tabla=j*i;
				System.out.println(i + "x" + j +  "=" + tabla);
			}
			System.out.println();
		
		}
	}

}
