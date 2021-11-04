programa
{
	
	funcao inicio()
	{
		inteiro a, b, c, r, s, d
		escreva("Olá, escreva o primeiro numero: ")
		leia(a)
		escreva("Escreva o segundo numero: ")
		leia(b)
		escreva("Escreva o terceiro numero: ")
		leia(c)

		r = (a + b) * (a + b)
		s = (b + c) * (b + c)

		d = (r + s) / 2
		
		escreva("O resultado é: " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */