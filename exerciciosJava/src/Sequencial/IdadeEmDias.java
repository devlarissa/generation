package Sequencial;

import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de 
 * uma pessoa expressa em anos, meses e 
 * dias e mostre-a expressa apenas em dias. 
 * */

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva sua idade: ");
		System.out.println("Quantos anos: ");
		int anos = ler.nextInt(); 
		
		System.out.println("Quantos meses: ");
		int meses = ler.nextInt();
		
		System.out.println("Quantos dias: ");
		int dias = ler.nextInt();
		
		int idadeEmDias = (anos * 365) + (meses * 12) + dias;
		
		System.out.println("Sua idade em dias é de " + idadeEmDias + " dias");
		ler.close();
	}
}
