package Sequencial;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica 
 * com a percentagem do distribuidor e dos impostos (aplicados ao 
 * custo de f�brica). Supondo que a percentagem do distribuidor seja de 
 * 28% e os impostos de 45%, escrever um sistema que leia o custo de 
 * f�brica de um carro e escreva o custo ao consumidor. 
 * */

public class CustoDoCarro {
	
	public static void main(String[] args) {
		
		double custoInicial, custoFinal;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escreva o custo de fabrica: ");
		custoInicial = ler.nextDouble();
		
		custoFinal = custoInicial + (custoInicial * 0.28) + (custoInicial * 0.45);
		
		System.out.printf("O custo final do carro foi de R$ %.2f", custoFinal);
		
		ler.close();
	}
}
