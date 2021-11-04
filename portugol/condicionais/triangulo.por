programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva("Escreva a base do triangulo: ")
		leia(base)
		escreva("Escreva a altura do triangulo: ")
		leia(altura)

		se(base > 0 e altura > 0){
			area = base * altura
			escreva("A area do triangulo é de :" + area)
		}
	}
}

/*
7) Receber valores de base e altura de um triângulo e 
verificar se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo.

*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */