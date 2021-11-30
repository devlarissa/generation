package classes;

public class ProdutoEletronico {
	
	private String nome;
	private String tamanho;
	private int unidades;

	public ProdutoEletronico(String nome, String tamanho, int unidades) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.unidades = unidades;
	}
	
	public void ligar() {
		System.out.println("ligando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
}
