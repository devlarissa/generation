package Condicional;

import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. Se for par exiba também 
 * a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
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
		
		System.out.printf("O numero é %d, e o resultado da equação foi %.2f", numero, numero2);
		
		ler.close();
	}
}
