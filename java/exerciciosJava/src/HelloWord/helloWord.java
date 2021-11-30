package HelloWord;

import java.util.Scanner;

public class helloWord {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Ola, digite seu nome");
		String nome = ler.next();
		
		System.out.println("Quantos carrinhos voce tem? ");
		int atual;
		atual = ler.nextInt();
		
		System.out.println("Quantos carrinhos voce comprou? ");
		int compra = ler.nextInt();
		
		int totalCarrinhos = atual + compra;
		
		System.out.println(nome + " tem " + totalCarrinhos + " carrinhos");
		
		double y, x;
		x = 0;
		y = Math.pow(x, 3);
		x = 3 % 3;
		x = Math.sqrt(atual);
		
		System.out.printf("%.2f, %.2f", x, y);
		
		ler.close();
	}
	
}
