programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Olá, escreva um numero: ")
		leia(numero)
		
		se(numero % 2 == 0 e numero >= 0){
			escreva("O numero " + numero + " é par e positivo")
		}
		senao se(numero % 2 == 0 e numero < 0){
			escreva("O numero " + numero + " é par e negativo")
		}
		senao se(numero % 2 == 1 e numero >= 0){
			escreva("O numero " + numero + " é impar e positivo")
		}
		senao{
			escreva("O numero " + numero + " é impar e negativo")
		}

	}
}

/*
Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */