package Condicional;

import java.util.Scanner;

/*
 * Fa�a um programa que receba a idade de uma pessoa e mostre 
 * na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto

 * */

public class FaixaEtaria {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Escreva sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade < 15) {
			System.out.print("Voc� est� na classe infantil");
		}
		else if(idade > 14 && idade < 18 ) {
			System.out.print("Voc� est� na classe juvenil");
		}
		else if(idade > 17 && idade < 26) {
			System.out.print("Voc� est� na classe adulto");
		}
		else {
			System.out.print("N�o h� salas para sua idade");
		}
		
		ler.close();
	}
}
