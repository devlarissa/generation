programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		inteiro x, lista[10], maior = 0, cont = 0
		real media = 0.0
		
		para(x = 0; x < 10; x++){

			lista[x] = util.sorteia(1, 6)
			se( lista[x] > maior){
				maior = lista[x]
			}
		}
		
		para(x = 0; x < 10; x++){

			escreva(lista[x], ", ")
			media += lista[x]

			se(lista[x] == maior){
				cont++
			}
		}
		media = media / 10

		 escreva("\nA media dos valores foi de: ", media)
		 escreva("\nA maior pontuação foi de: ", maior, " e apareceu ", cont, " vez(es)")
	}
}

/*
Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva 
esse vetor. A seguir determine e imprima a média aritmética dos 
lançamentos, contabilize e apresente também quantas foram as 
ocorrências da maior pontuação
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */