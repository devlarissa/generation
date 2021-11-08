package Sequencial;

import java.util.Scanner;

/*
 * Faça um sistema que leia o tempo de duração de um evento
 *  em uma fábrica expressa em segundos e mostre-o expresso 
 *  em horas, minutos e segundos.
 * */

public class DuracaoEvento {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int segundos, minutos, horas;
		
		System.out.print("Escreva a duracao do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		segundos = segundos % 3600;
		
		minutos = segundos / 60;
		segundos = segundos % 60;
		
		System.out.print("Seu evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
		
	}
}
