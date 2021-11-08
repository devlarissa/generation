package Sequencial;

import java.util.Scanner;

/*
 *  Um sistema de equações lineares do tipo: ax + by = c E dx + ey = f
pode ser resolvido segundo mostrado abaixo : 
 x = (ce - bf) / (ae - bd) E y = (af - cd) / (ae - bd)
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 
 * */

public class ValoresXeY {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, e, f;
		double x, y;
		
		System.out.print("Escreva os coeficientes: ");
		System.out.print("A: ");
		a = ler.nextInt();
		
		System.out.print("B: ");
		b = ler.nextInt();
		
		System.out.print("C: ");
		c = ler.nextInt();
		
		System.out.print("D: ");
		d = ler.nextInt();
		
		System.out.print("E: ");
		e = ler.nextInt();
		
		System.out.print("F: ");
		f = ler.nextInt();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.printf("Os valores de x e y são de %.2f e %.2f", x, y);
	}
}
