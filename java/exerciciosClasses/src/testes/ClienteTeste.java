package testes;

import classes.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Carlos", "Rua Nunes, 11", 21);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEndereco());
		
		System.out.println(cliente.getIdade());
		cliente.setIdade(32);
		System.out.println(cliente.getIdade());
	}
}

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida 
 * crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 * */