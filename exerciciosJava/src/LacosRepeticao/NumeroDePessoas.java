package LacosRepeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total 
 * de pessoas com menos de 21 anos. Total de pessoas com mais de 
 * 50 anos. O programa termina quando idade for =-99. (WHILE)
 * */

public class NumeroDePessoas {

	public static void main(String[] args) {
		
		int idade, maiores = 0, menores = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite -99 para sair");
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		while ( idade != -99) {
			
			if (idade < 21) {
				menores++;
			}
			if (idade > 50) {
				maiores++;
			}
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
		}
		
		System.out.println("O numero de menores de 21 é de " + menores + " e de maiores de 50 é de " + maiores);
		ler.close();
	}
}
