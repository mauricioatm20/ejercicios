package com.CursoJava.Introduccion.Ejercicios;

import java.util.Scanner;

public class ejer12 {
	
/*Escribir un programa que reciba un número n e imprima los primeros n números 
triangulares, junto con su índice. Los números triangulares se obtienen mediante la suma 
de los números naturales desde 1 hasta el índice n. Por ejemplo, el número triangular de 
índice 4 es 1+2+3+4 = 10.
Entonces, si se piden los primeros 5 números triangulares, el programa debe imprimir (sin 
los comentarios entre paréntesis):
1 – 1 (1)
2 – 3 (1+2)
3 – 6 (1+2+3)
4 – 10 (1+2+3+4)
5 – 15 (1+2+3+4+5)*/
	
	
	public static void main(String[] args) {
		
		int suma =0;
		for(int i=1; i<=9; i++) {
			suma = suma+i;
			
			System.out.println(i +"="+ suma);
		}
	}

}
