programa
{
	
	funcao inicio()
	{
		inteiro x, y, n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		para(x = 0; x < 4; x++){
			
			para(y = 0; y < 6; y++){

				escreva("\nEscreva um numero: ")
				leia(n1[x][y])
			}
		}

		para(x = 0; x < 4; x++){
			
			para(y = 0; y < 6; y++){

				escreva("\nEscreva um numero: ")
				leia(n2[x][y])
			}
		}

		para(x = 0; x < 4; x++){
			
			para(y = 0; y < 6; y++){

				m1[x][y] = n1[x][y] + n2[x][y]
				m2[x][y] = n1[x][y] - n2[x][y]
			}
		}
	}
}

/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 16, 2}-{n2, 6, 26, 2}-{m1, 6, 36, 2}-{m2, 6, 46, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */