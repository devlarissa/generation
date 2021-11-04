programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro idadeEmDias, anos, meses, dias
		escreva("Olá, escreva sua idade em dias: ")
		leia(idadeEmDias)
		
		anos = idadeEmDias / 365
		idadeEmDias = idadeEmDias - (365 * anos)
		
		meses = idadeEmDias / 30
		idadeEmDias = idadeEmDias - (30 * meses)

		dias = idadeEmDias

		escreva("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */