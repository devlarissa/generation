package Sequencial;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias
 *  e mostre-a expressa em anos, meses e dias. 

 * */

public class IdadeEmAnosMesesEDias {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		int dias = leia.nextInt();
		
		int anos, meses;
		
		anos = dias / 365;
		dias = dias % 365;
		
		meses = dias / 30;
		dias = dias % 30;
		
		System.out.print("Sua idade é de " + anos + " anos, " + meses + " meses e " + dias + " dias");
		leia.close();
	}
}
