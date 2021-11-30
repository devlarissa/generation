package Vetores;

import java.util.Scanner;

/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
 * */

public class SeisNumeros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[6];
		int somaPares = 0, quantidadeImpares = 0, quantidadePares = 0;
		
		// Recebe os valores do usuario e coloca num vetor. Faz a contagem e a soma dos pares e dos impares.
		for(int x = 0; x < 6; x++) {
			System.out.println("Digite um numero: ");
			numeros[x] = ler.nextInt();
			
			if (numeros[x] % 2 == 0) {
				quantidadePares++;
				somaPares += numeros[x];
			}
			else {
				quantidadeImpares++;
			}
		}
		
		int[] pares = new int[quantidadePares];
		int[] impares = new int[quantidadeImpares];
		
		int contPar = 0, contImpar = 0;
		
		//Coloca os valores pares e impares dentro dos vetores para cada um. 
		for(int numero: numeros) {
			if (numero % 2 == 0) {
				pares[contPar] = numero;
				contPar++;
			}
			else {
				impares[contImpar] = numero;
				contImpar++;
			}
		}
		
		System.out.print("Os numeros pares s�o ");
		
		//Imprime os pares.
		for(int par: pares) {
			System.out.print(par + ", ");
		}
		
		System.out.println("\nA soma dos numeros pares � de " + somaPares);
		
		System.out.print("Os numeros impares s�o ");
		
		//Imprime os impares.
		for(int impar: impares) {
			System.out.print(impar + ", ");
		}
		
		System.out.println("\nA quantidade de numeros impares � de " + quantidadeImpares);
		
		ler.close();
	}
}
