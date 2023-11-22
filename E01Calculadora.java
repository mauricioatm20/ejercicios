package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class E01Calculadora{
		
		@SuppressWarnings("resource")
		
		public static void main(String[] args) {
			
	        Scanner teclado;
			teclado = new Scanner(System.in);
			
			
			System.out.println("Ingresa un operador (+ - * / )");
			String operador = teclado.nextLine();
			
	        System.out.println("Ingresa primer operador");
	            double num1 = teclado.nextDouble();
	            
	        System.out.println("Ingresa segundo operador");
			    double num2 = teclado.nextDouble();
				
			double resultado = 0.0;
			    
			 switch (operador) {
			    case "+":
			    resultado = num1 + num2;
			    break;
			    case "-":
				    resultado = num1 - num2;
				    break;
			    case "*":
				    resultado = num1 * num2;
				    break;
			    case "/":
				    resultado = num1 / num2;
				    break;
			    }
			    System.out.println( "El resultado de " + num1 + " "+ operador +" " + num2 + " = " + resultado );
				
		}

	 }
		