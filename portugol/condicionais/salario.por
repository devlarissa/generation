programa
{
	
	funcao inicio()
	{
		inteiro c, n
		real salario, E
		
		escreva("Olá, escreva o codigo: ")
		leia(c)
		escreva("Escreva o numero de horas trabalhadas: ")
		leia(n)

		se (n <= 50){
			salario = n * 10.0
			E = 0.0
		}
		senao{
			salario = 50.0 * 10.0
			E = (n - 50.0) * 20.0 
		}
		escreva("O salario foi de " + salario + " reais e o extra foi de " + E + " reais")
	}
}

/*
Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */