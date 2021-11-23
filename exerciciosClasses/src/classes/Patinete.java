package classes;

public class Patinete {

	private int numeroRodas;
	private int tamanho;
	
	public Patinete(int n, int t) {
		numeroRodas = n;
		tamanho = t;
	}
	
	public void ajustarAltura(int t) {
		this.tamanho = t;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
}
