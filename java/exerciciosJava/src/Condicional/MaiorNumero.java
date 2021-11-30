package Condicional;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maior;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = ler.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			maior = numero2;
		}
		else {
			maior = numero3;
		}
		
		System.out.print("O maior numero é " + maior);
		
		ler.close();
	}
}
