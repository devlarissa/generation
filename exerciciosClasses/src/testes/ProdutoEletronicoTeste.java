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
 * 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console.*/