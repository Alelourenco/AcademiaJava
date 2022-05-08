package ex05_slide56;

public class Pessoa {
	int idade;
	String nome;

	Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
		System.out.println("O nome da pessoa é: " + this.nome + " e a idade é: " + this.idade);
	}

	Pessoa(int idade) {
		this.idade = idade;
		System.out.println("A idade da Pessoa é: " + this.idade);
	}

}