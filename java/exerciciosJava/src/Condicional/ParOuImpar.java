package Condicional;

import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
 * a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 * */

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		double numero2;
		
		System.out.print("Escreva um numero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			numero2 = Math.sqrt(numero);
		}
		else {
			numero2 = Math.pow(numero, 2);
		}
		
		System.out.printf("O numero � %d, e o resultado da equa��o foi %.2f", numero, numero2);
		
		ler.close();
	}
}
