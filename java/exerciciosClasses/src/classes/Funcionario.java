package classes;

public class Funcionario {

	private String nome;
	private String endereco;
	private int idade;
	
	public Funcionario(String n, String e, int i) {
		nome = n;
		endereco = e;
		idade = i;
	}
	
	public void tostring() {
		System.out.println("O funcionario " + nome + "de idade " + idade + " anos, mora na " + endereco);
	}
	public void trabalhar() {
		System.out.println("O funcionario começou a trabalhar");
	}
}
