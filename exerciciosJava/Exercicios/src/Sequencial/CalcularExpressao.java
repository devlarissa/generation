package Sequencial;

import java.util.Scanner;

/*
 *  Escreva  um sistema que leia três números inteiros 
 *  e positivos (A, B, C) e calcule a seguinte expressão:
 *  D = (R + S) / 2 onde R = (A + B)^2 e S = (B + C)^2  

 * */

public class CalcularExpressao {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		double D, R, S;
		
		System.out.print("Escreva o primeiro numero: ");
		A = ler.nextInt();
		
		System.out.print("Escreva o segundo numero: ");
		B = ler.nextInt();
		
		System.out.print("Escreva o terceiro numero: ");
		C = ler.nextInt();
		
		R = Math.sqrt(A + B);
		S = Math.sqrt(B + C);
		D = (R + S) / 2;
		
		System.out.printf("O valor de D é de %.2f", D);
	}
}
