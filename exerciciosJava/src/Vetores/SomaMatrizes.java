package Vetores;

import java.util.Scanner;

/* *  Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o 
resultado da adição da constante deve ser armazenado na própria matriz. * */

public class SomaMatrizes {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int op, linha, coluna, var;
		float[][] array1 = new float[2][2];
		float[][] array2 = new float[2][2];
		float[][] array3 = new float[2][2];
		
		for(linha = 0; linha < 2; linha++) {
			
			for(coluna = 0; coluna < 2; coluna++) {
				
				System.out.println("\nEntre com os valores do Array1: ");
				array1[linha][coluna] = leia.nextInt();
				System.out.println("\nEntre com os valores do Array1: ");
				array1[linha][coluna] = leia.nextInt();	
				
			}
		}
			
		do {
			System.out.println("Menu de opções: ");
			System.out.println("\n(1) somar as duas matrizes");
			System.out.println("\n(2) a diferenca entre as duas matrizes");
			System.out.println("\n(3) somar uma varialvel as matrizes");
			System.out.println("\n(4) imprimir as matrizes");
			System.out.println("\n(5) sair do sistema");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
				
		}while(op != 5);
			
		switch(op) {
		case 1:
			for(linha = 0; linha < 2; linha++) {
			
				for(coluna = 0; coluna < 2; coluna++) {
					array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
					System.out.println("\nSoma: " + array3[linha][coluna]);
				}
			}
			break;
		case 2:
			for(linha = 0; linha < 2; linha++) {
						
				for(coluna = 0; coluna < 2; coluna++) {
					array3[linha][coluna] = array2[linha][coluna] - array1[linha][coluna];
					System.out.println("\nDiferença: " + array3[linha][coluna]);
				}
			}
			break;
					
		case 3:
			System.out.println("Entre com um valor: ");
			var = leia.nextInt();
					
			for(linha = 0; linha < 2; linha++) {
						
				for(coluna = 0; coluna < 2; coluna++) {
					
					array1[linha][coluna] = array1[linha][coluna] + var;
					array2[linha][coluna] = array2[linha][coluna] + var;
					System.out.println("\nVariavel somada ao array1: " + array1[linha][coluna]);
					System.out.println("\nVariavel somada ao array2: " + array2[linha][coluna]);
				}
			}
			break;
					
		case 4:
			
			for(linha = 0; linha < 2; linha++) {
						
				for(coluna = 0; coluna < 2; coluna++) {
					System.out.println("\n array1: " + array1[linha][coluna]);
					System.out.println("\nVarray2: " + array2[linha][coluna]);
				}
			}
			break;
				
		case 5:
			System.out.println("Obrigada por participar");
			break;
				
		default:
			System.out.println("\n Opção Invalida");
		}
		
		leia.close();
	}
}
