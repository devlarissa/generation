package LacosRepeticao;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 * */

public class ParEImpar {

	public static void main(String[] args) {
		
		int numero, par = 0, impar = 0;
		Scanner ler = new Scanner(System.in);
		
		
		for (int x = 0; x < 10; x++) {
			
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("O numero de pares � de: " + par + " e de impares � de: " + impar);
		
		ler.close();
	}
}
