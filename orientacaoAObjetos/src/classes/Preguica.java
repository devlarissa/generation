package classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		
		super(nome, idade);
	}
	
	public void subirEmArvores() {
		System.out.println(getNome() + " subindo a arvore");
	}
}
