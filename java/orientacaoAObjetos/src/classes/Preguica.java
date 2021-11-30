package classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("emitindo som de preguiça");
	}
	
	@Override
	public void locomocao() {
		System.out.println(getNome() + " subindo a arvore");
	}
	
	public void preguicaInfo() {
		System.out.println("O nome da preguica é " + getNome());
		System.out.println("A idade é " + getIdade());
		System.out.println("Chamando o metodo locomocao : ");
		locomocao();
		emitirSom();
		
	}
}
