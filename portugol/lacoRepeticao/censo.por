programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro x, filhos, mediaFilhos = 0
		real salario, mediaSalario = 0.0, maiorSalario = 0.0, percentual = 0.0

		para(x = 1; x <= 20; x++){
			
			escreva("Qual o seu salario? ")
			leia(salario)
			escreva("Quantos filhos você tem? ")
			leia(filhos)

			mediaSalario = mediaSalario + salario

			mediaFilhos = mediaFilhos + filhos

			se(maiorSalario < salario){
				maiorSalario = salario
			}

			se(salario <= 100.0){
				percentual++
			}
		}
		mediaSalario = mediaSalario / 20.0
		escreva("A media do salario é de R$", mediaSalario, " reais")

		mediaFilhos = mediaFilhos / 20
		escreva("\nA media dos filhos é de ", mediaFilhos, " filho(s)")

		escreva("\nO maior salario é de R$", maiorSalario, " reais")

		percentual = (percentual / 20.0) * 100.0
		escreva("\nO percentual de pessoas com salario até R$100,00 é de ", mat.arredondar(percentual, 2), "%")
		
	}
}

/* executar com para
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 931; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */