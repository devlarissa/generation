package classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("emitindo som de pregui�a");
	}
	
	@Override
	public void locomocao() {
		System.out.println(getNome() + " subindo a arvore");
	}
	
	public void preguicaInfo() {
		System.out.println("O nome da preguica � " + getNome());
		System.out.println("A idade � " + getIdade());
		System.out.println("Chamando o metodo locomocao : ");
		locomocao();
		emitirSom();
		
	}
}
