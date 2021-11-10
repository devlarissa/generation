package LacosRepeticao;

import java.util.Scanner;

/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa 
 * era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se 
 * para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * n�mero de pessoas calmas; okay
 * n�mero de mulheres nervosas; okay 
 * n�mero de homens agressivos; okay
 * n�mero de outros calmos; okay
 * n�mero de pessoas nervosas com mais de 40 anos; 
 * n�mero de pessoas calmas com menos de 18 anos. */

public class CaracteristicasPsicologicas {

	public static void main(String[] args) {
		
		int cont = 0, idade, sexo, humor, calma = 0, mulherNervosa = 0, homemAgressivo = 0;
		int outrosCalmos = 0, nervosasMaiores = 0, calmasMenores = 0;
		Scanner ler = new Scanner(System.in);
		
		while (cont < 6) {
			
			System.out.print("\nQual sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Qual o seu sexo? (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			
			if (! (sexo == 1) && ! (sexo == 2) && ! (sexo == 3) ) {
				System.out.println("Op��o invalida!");
				break;
			}
			
			System.out.println("Qual seu humor? (1-se voce � calmo(a) / 2-se voce � nervoso(a) / 3-se voce � agressivo(a) ): ");
			humor = ler.nextInt();
			
			if(! (humor == 1) && ! (humor == 2) && ! (humor == 3) ) {
				System.out.println("Op��o invalida!");
				break;
			}
			
			if (humor == 2) {
				if (sexo == 1) {
					mulherNervosa++;
				}
				if(idade > 40) {
					nervosasMaiores++;
				}
			}
			
			if (sexo == 2 && humor == 3) {
				homemAgressivo++;
			}
			
			if(humor == 1) {
				calma++;
				
				if (sexo == 3) {
					outrosCalmos++;
				}
				if(idade < 18) {
					calmasMenores++;
				}
				
			}
			
			cont+=1;
			
		}
		
		System.out.println("O numero de pessoas calmas � de: " + calma);
		System.out.println("O numero de mulheres nervosas � de: " + mulherNervosa);
		System.out.println("O numero de homens agressivos � de: " + homemAgressivo);
		System.out.println("O numero de outros calmos � de: " + outrosCalmos);
		System.out.println("O numero de pessoas maiores de 40 anos e nervosas � de: " + nervosasMaiores);
		System.out.println("O numero de pessoas menores de 18 anos e calmas � de: " + calmasMenores);
		
		ler.close();
	}
}
