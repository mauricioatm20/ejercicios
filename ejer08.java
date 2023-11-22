package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer08 {
/*Escribir un programa que imprima todos los números pares entre dos números que se le 
pidan al usuario*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int numero =teclado.nextInt();
		
		System.out.println("Ingrese un numero");
		int numero1 =teclado.nextInt();
		
		if(numero%2 !=0) {
			numero++;
		}
		for(int i=numero; i<numero1; i+=2) {
			System.out.println(i);
		}
		
	}

}
