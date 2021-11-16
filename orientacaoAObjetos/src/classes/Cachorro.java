package classes;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println(getNome() + " correndo");
	}
	
	public void cachorroInfo() {
		System.out.println("O nome do cachorro � " + getNome());
		System.out.println("A idade � " + getIdade());
		System.out.println("Chamando o metodo correr : ");
		correr();
		emitirSom();
		
	}
}
