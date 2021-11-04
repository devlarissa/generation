programa
{
	
	funcao inicio()
	{
		inteiro x, maior = 0, pontos[5]
		
		para(x = 0; x < 5; x++){
			escreva("\nEscreva a pontuação ", x + 1, " : ")
			leia(pontos[x])
			se( pontos[x] > maior){
				maior = pontos[x]
			}
		}
		para(x = 0; x < 5; x++){
			escreva("\nA pontuação ", x + 1, " foi de ", pontos[x])
		}
		escreva("\nA maior pontuação foi de : ", maior)
	}
}

/*
Faça um programa que crie um vetor por leitura 
com 5 valores de pontuação de uma atividade e 
o escreva em seguida. Encontre após a maior 
pontuação e a apresente. 
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */