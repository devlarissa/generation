programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro x = 0
		real numero, soma = 0.0, media = 0.0
		
		escreva("Digite um numero: ")
		leia(numero)
		
		enquanto(numero >= 0){

			soma = soma + numero
			x++
			
			escreva("Digite um numero: ")
			leia(numero)
		}
		
		se(x == 0){
			escreva("Só são permitidos numeros positivos")
		}
		senao{
			media = mat.arredondar((soma / x), 2)	
		}

		escreva("\nA soma dos numeros foi de: ", soma)
		escreva("\nA media dos numeros foi de: ", media)
		escreva("\nA quantidade de numeros foi de: ", x)
	}
}

/*
Elaborar um programa que efetue a leitura 
sucessiva de valores numéricos e apresente 
no final o total do somatório, a média e o 
total de valores lidos. O programa deve 
fazer as leituras dos valores enquanto o 
usuário estiver fornecendo valores positivos. 
Ou seja, o programa deve parar quando o usuário 
fornecer um valor negativo.
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */