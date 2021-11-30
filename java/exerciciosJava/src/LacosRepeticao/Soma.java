package LacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que 
 * encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
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
		
		System.out.println("A soma � de " + soma);
		
		ler.close();
	}
}
