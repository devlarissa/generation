programa
{
	
	funcao inicio()
	{
		inteiro a, b, c, d, E, f, x, y
		escreva("Olá, escreva os coeficientes de A a F")
		escreva("\na: ")
		leia(a)
		escreva("b: ")
		leia(b)
		escreva("c: ")
		leia(c)
		escreva("d: ")
		leia(d)
		escreva("e: ")
		leia(E)
		escreva("f: ")
		leia(f)

		x = ((c*E)-(b*f)) / ((a*E)-(b*d))
		y = ((a*f)-(c*d)) / ((a*E)-(b*d))

		escreva("O valor de x é " + x + " e de y é " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */