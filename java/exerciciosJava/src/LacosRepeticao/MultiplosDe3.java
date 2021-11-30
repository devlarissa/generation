package LacosRepeticao;

/*
 * Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 * */

import java.util.Scanner;

public class MultiplosDe3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero = 0, soma =0, cont = 0;
		
		do {
			if(numero % 3 == 0) {
				soma += numero;
				cont++;
			}
			
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
		}while (! (numero == 0) );
		
		if(cont > 1) {
			cont -=1;
		}
		
		System.out.println("A media dos multiplos de 3 é de " + (soma / cont));
		
		ler.close();
	}
}
