package testes;

import classes.Aviao;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao boing = new Aviao("Tavares", 92);
		
		System.out.println("Nome do piloto: " + boing.getPiloto());
		System.out.println("Numero de passageiros: " + boing.getNumeroPassageiros());
		
		boing.voar();
		boing.pousar();
	}
}

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em 
 * seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es 
 * deste objeto no console.
 * */