package ex06_slide66;

public class Funcionario extends Pessoa {

	String setor;
	String cargo;
	String funcao;

	public void atribuirValores(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
		super.nome = nome;
		super.idade = idade;
		super.telefone = telefone;
		this.setor = setor; 
		this.cargo = cargo;
		this.funcao = funcao;
	}

	public void exibirValores() {
		System.out.println("Nome: " + super.nome);
		System.out.println("Idade: " + super.idade);
		System.out.println("Telefone: " + super.telefone);
		System.out.println("Setor: " + this.setor);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Funçâo: " + this.funcao);
		System.out.println();
	}

}
