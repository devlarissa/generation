programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4, quadrado1, quadrado2, quadrado3, quadrado4
		escreva("Olá, escreva os quatro numeros: ")
		escreva("\nPrimeiro numero: ")
		leia(numero1)
		escreva("Segundo numero: ")
		leia(numero2)
		escreva("Terceiro numero: ")
		leia(numero3)
		escreva("Quarto numero: ")
		leia(numero4)

		quadrado1 = mat.potencia(numero1, 2.0)
		quadrado2 = mat.potencia(numero2, 2.0)
		quadrado3 = mat.potencia(numero3, 2.0)
		quadrado4 = mat.potencia(numero4, 2.0)
		
		se(quadrado3 >= 1000.0){
			escreva("O quadrado do terceiro numero é: " + quadrado3)
		}
		senao{
			escreva("\n" + numero1 + " ao quadrado é " + quadrado1)
			escreva("\n" + numero2 + " ao quadrado é " + quadrado2)
			escreva("\n" + numero3 + " ao quadrado é " + quadrado3)
			escreva("\n" + numero4 + " ao quadrado é " + quadrado4)
		}
	}
}

/*
Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 857; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */