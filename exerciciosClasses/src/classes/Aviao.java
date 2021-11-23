package classes;

public class Aviao {
	
	private String piloto;
	private int numeroPassageiros;
	
	
	public Aviao(String piloto, int numeroPassageiros){
		this.piloto = piloto;
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public void voar() {
		System.out.println("Fechando as portas");
		System.out.println("Iniciando decolagem");
	}
	
	public void pousar() {
		System.out.println("Iniciando pouso");
		System.out.println("Abrindo as portas");
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
}
