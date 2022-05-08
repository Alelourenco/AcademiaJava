package ex06_slide66;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();

		String nome, telefone, setor, cargo, funcao;
		int idade;

		Scanner leitura = new Scanner(System.in);

		f1.atribuirValores("", 0, "", "", "", "");

		System.out.println("Nome");
		nome = leitura.nextLine();
		System.out.println("Idade");
		idade = Integer.parseInt(leitura.nextLine());
		System.out.println("Telefone");
		telefone = leitura.nextLine();
		System.out.println("Setor");
		setor = leitura.nextLine();
		System.out.println("Cargo");
		cargo = leitura.nextLine();
		System.out.println("Função");
		funcao = leitura.nextLine();
		f2.atribuirValores(nome, idade, telefone, setor, cargo, funcao);
		f3.atribuirValores(nome, idade, telefone, setor, cargo, funcao);

		f1.exibirValores();
		f2.exibirValores();
		f3.exibirValores();
	}

}
