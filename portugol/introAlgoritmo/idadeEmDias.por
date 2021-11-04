programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, idadeEmDias
		escreva("Olá, escreva sua idade")
		escreva("\nQuantos anos? ")
		leia(anos)
		escreva("\nQuantos meses? ")
		leia(meses)
		escreva("\nQuantos dias? ")
		leia(dias)

		idadeEmDias = (anos * 365) + (meses * 30) + dias
		escreva("Sua idade em dias é: " + idadeEmDias + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */