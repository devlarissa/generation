package LacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que 
 * encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
 * */

public class Soma {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double numero = 0, soma = 0;
		
		do {
			soma = soma + numero;
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
		}while (! (numero == 0) );
		
		System.out.println("A soma é de " + soma);
		
		ler.close();
	}
}
