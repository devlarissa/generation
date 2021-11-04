programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real equacao, x1, y1, x2, y2, d
		escreva("Olá, escreva a coordenada x do ponto 1: ")
		leia(x1)
		escreva("Escreva a coordenada y do ponto 1: ")
		leia(y1)
		escreva("Escreva a coordenada x do ponto 2: ")
		leia(x2)
		escreva("Escreva a coordenada y do ponto 2: ")
		leia(y2)

		equacao = mat.potencia((x2 - x1), 2.0) + mat.potencia((y2 - y1), 2.0)
		d = mat.raiz(equacao, 2.0)

		escreva("A distancia entre os pontos é de: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */