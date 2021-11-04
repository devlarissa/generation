programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		escreva("Olá, escreva a primeira nota: ")
		leia(nota1)
		escreva("Escreva a segunda nota: ")
		leia(nota2)
		escreva("Escreva a terceira nota: ")
		leia(nota3)

		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5)
		escreva("Sua media é: " + mat.arredondar(media, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */