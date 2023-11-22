package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer04 {
/*De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.*/
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una lista de numeros");
		int lista = teclado.nextInt();
		
		int menor=100;
		int numero;
		int mayor=0;
		
		for(int i =1; i<=lista; i ++) {
			System.out.println("ingese un numero");
			numero = teclado.nextInt();
			
			if(numero<menor) {
				menor=numero;	
			}
				else {
				mayor=numero;
				}
		}
		System.out.println("el numero menor es "+ menor);
		System.out.println("el numero menor es "+ mayor);
		
	}
}
