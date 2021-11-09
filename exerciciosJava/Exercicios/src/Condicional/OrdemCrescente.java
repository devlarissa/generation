package Condicional;

import java.util.Scanner;

// Faça um programa que entre com três números e coloque em ordem crescente.

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = ler.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			if(numero2 > numero3) {
				System.out.printf("A ordem crescente é %d, %d e %d", numero3, numero2, numero1);
			}
			else {
				System.out.printf("A ordem crescente é %d, %d e %d", numero2, numero3, numero1);
			}
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			if(numero1 > numero3) {
				System.out.printf("A ordem crescente é %d, %d e %d", numero3, numero1, numero2);
			}
			else {
				System.out.printf("A ordem crescente é %d, %d e %d", numero1, numero3, numero2);
			}
		}
		else {
			if(numero1 > numero2) {
				System.out.printf("A ordem crescente é %d, %d e %d", numero2, numero1, numero3);
			}
			else {
				System.out.printf("A ordem crescente é %d, %d e %d", numero1, numero2, numero3);
			}
		}
		
		ler.close();
	}
}
