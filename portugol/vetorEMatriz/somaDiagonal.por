programa
{
	
	funcao inicio()
	{
		inteiro x, y, matriz[3][3], soma

		para(x = 0; x < 3; x++){

			para(y = 0; y < 3; y++){

				escreva("Escreva um numero: ")
				leia(matriz[x][y])
				
			}

		}

		soma = matriz[0][2] + matriz[1][1] + matriz[2][0]

		escreva("A soma da diagonal principal é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 16, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */