package Sequencial;

import java.util.Scanner;

/*
 *  Faça um sistema que leia as 3 notas de um aluno e calcule a média
 *   final deste aluno. Considerar que a média é ponderada e que o 
 *   peso das notas é: 2,3 e 5, respectivamente.
 * */

public class MediaPonderada {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Escreva a primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.print("Escreva a segunda nota: ");
		nota2 = ler.nextFloat();
		
		System.out.print("Escreva a terceira nota: ");
		nota3 = ler.nextFloat();
		
		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
		
		System.out.printf("A media foi de %.2f", media);
		
		ler.close();
	}
}
