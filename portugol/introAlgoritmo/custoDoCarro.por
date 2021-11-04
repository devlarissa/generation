programa
{
	
	funcao inicio()
	{
		real valorFabrica, valorFinal
		escreva("Olá, escreva o custo de fabrica do carro: ")
		leia(valorFabrica)
		
		valorFinal = valorFabrica + (valorFabrica * 0.28) + (valorFabrica * 0.45)
		
		escreva("O custo final ao consumidor do carro é de " + valorFinal + " reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */