package classes;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("relinchando");
	}
	
	public void cavaloInfo() {
		System.out.println("O nome do cavalo é " + getNome());
		System.out.println("A idade é " + getIdade());
		System.out.println("Chamando o metodo locomocao : ");
		locomocao();
		emitirSom();
		
	}
}
