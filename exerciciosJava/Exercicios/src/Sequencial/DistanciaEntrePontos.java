package Sequencial;

import java.util.Scanner;

/*
 *  Construa um programa em c que, tendo como dados 
 *  de entrada dois pontos quaisquer no plano, 
 *  P(x1, y1) e P(x2, y2), escreva a distância 
 *  entre eles. A fórmula que efetua tal cálculo é: ((x2 - x1) + (y2 - y1))^(1/2)
 * */

public class DistanciaEntrePontos {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x1, y1, x2, y2;
		double distancia;
		
		System.out.print("Escreva a coordenada x1: ");
		x1 = ler.nextInt();
		
		System.out.print("Escreva a coordenada y1: ");
		y1 = ler.nextInt();
		
		System.out.print("Escreva a coordenada x2: ");
		x2 = ler.nextInt();
		
		System.out.print("Escreva a coordenada y2: ");
		y2 = ler.nextInt();
		
		distancia = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		
		System.out.printf("A distancia entre os pontos foi de: %.2f", distancia);
	}
}
