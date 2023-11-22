package com.CursoJava.Introduccion.Ejercicios;

public class ejer13 {
/*Escribir un programa que imprima por pantalla todas las fichas de dominó, de una por 
línea y sin repetir.
0 : 0
0 : 1*/
	
	public static void main(String[] args) {
		
		for(int i=0; i<=6; i++) {
													//el primero bucle recorre i= de 0-6 y en el segundo bucle j=i j empieza con el mismo valor de i cuando (j=0 i =0)
			for(int j=i; j<=6; j++) {
				System.out.println(i + ":" + j);
			}
		}
	}

}
