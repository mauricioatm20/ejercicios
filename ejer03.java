package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer03 {
/*De una lista de n números ingresados por teclado, imprimir el mayor.*/
	
	public static void main(String[] args) {
		
	Scanner teclado;
	teclado = new Scanner(System.in);
	

	System.out.println("ingrese lista numeros");
	int lista = teclado.nextInt();
	
	int mayor =0;
	int numero;
		
		for(int i=1; i<=lista; i++) {
		System.out.println("ingrese un numero");
		numero = teclado.nextInt();
		
			if	(numero>mayor) {
			mayor=numero;
			}
			
		}	System.out.println("el numero mayor es  " + mayor);
		
	}
}
