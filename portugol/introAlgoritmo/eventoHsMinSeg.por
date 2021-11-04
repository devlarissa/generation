programa
{
	
	funcao inicio()
	{
		inteiro segundos, horas, minutos
		escreva("Olá, quantos segundos duraram o evento? ")
		leia(segundos)

		horas = segundos / 60
		segundos = segundos - (60 * horas)

		minutos = segundos / 60
		segundos = segundos - (60 * minutos)

		escreva("Seu evento teve " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */