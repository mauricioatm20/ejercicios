package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer14 {
/*Escribir un programa que pida al usuario un número entero positivo y muestre por 
pantalla la cuenta atrás desde ese número hasta cero separados por comas.*/
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese un numero");
		int numero =teclado.nextInt();
		
		
		if(numero < 0) {
			System.out.println("el numero no es positivo");
			
		}	else {
			System.out.println("Cuenta atras");
			
			for (int i = numero; i >= 0; i--) {
				System.out.print(i + " , ");
			}
		}	
	}

}
