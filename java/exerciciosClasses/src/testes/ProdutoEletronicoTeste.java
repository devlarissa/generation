package testes;

import classes.ProdutoEletronico;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		ProdutoEletronico eletro = new ProdutoEletronico("televisao", "grande", 1);
		
		System.out.println(eletro.getNome());
		eletro.ligar();
	}
}

/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.*/