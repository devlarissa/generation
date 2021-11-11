package Vetores;

import java.util.Scanner;

/*
 *  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
 * */

public class QuantidadeDeNumeros10 {
	
	public static void main(String[] args) {
		
		int linha, coluna, numero, contador = 0;
		Scanner ler = new Scanner(System.in);
		int[][] vetor = new int[3][3];
		
		for(linha = 0; linha < 3; linha++) {
			
			for(coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Escreva um numero");
				numero = ler.nextInt();
				vetor[linha][coluna] = numero;
				
				if (numero > 10) {
					contador++;
				}
			}
		}
		
		System.out.println("O numero de valores maiores que 10 é de " + contador);
	}
}
