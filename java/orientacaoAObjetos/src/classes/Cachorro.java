package classes;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("latindo");
	}
	
	public void cachorroInfo() {
		System.out.println("O nome do cachorro � " + getNome());
		System.out.println("A idade � " + getIdade());
		System.out.println("Chamando o metodo locomocao : ");
		locomocao();
		emitirSom();
		
	}
}
