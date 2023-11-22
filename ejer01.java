package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer01 {
	/*Imprimir por pantalla los números 1 hasta un número ingresado por teclado.*/
	
	
	public static void main(String[] args) {
		
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un valor");
		int numMax = teclado.nextInt();
		
		for(int i=1; i<=numMax; i++)
			System.out.println(i + " ");
		
		/*Imprimir la suma de n números ingresados por teclado. La cantidad de números 
		(n) se solicita al usuario al principio y se ingresa por teclado*/
		
		System.out.println();
		

		System.out.println("ingresar cantidad de numeros a sumar");
		int cantNum = teclado.nextInt();
		
		int suma = 0; 
		int numero;
			
		for(int i =1; i<=cantNum; i++) {
			System.out.println("ingresar numero ");
			numero = teclado.nextInt();
			suma += numero;
		}
		
		System.out.println("La suma de los " + cantNum + " números ingresados es: " + suma);
		teclado.close();
	}
	 
}
