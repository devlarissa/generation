package testes;

import classes.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Osmar", "USP São Carlos", 28);
		
		funcionario.tostring();
		funcionario.trabalhar();
	}
}

/*
 *4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 *em seguida crie um objeto funcionário, defina as instancias deste objeto e 
 *apresente as informações deste objeto no console. */
 