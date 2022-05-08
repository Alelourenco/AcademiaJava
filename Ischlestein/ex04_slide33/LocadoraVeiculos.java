package ex04_slide33;

import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Carro carro = new Carro();
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();


		System.out.println("Escolha entre 'Moto' ou 'Carro' ");
		String menu = leitura.nextLine();
		if(menu.equals("Moto")) {

		String marca, modelo, cilindradas;
		System.out.println("Insira a marca da moto");
		marca = leitura.nextLine();
		System.out.println("Insira o modelo da moto");
		modelo = leitura.nextLine();
		System.out.println("Insira a cilindrada da moto");
		cilindradas = leitura.nextLine();
		
		moto1.atribuirValores(marca, modelo, cilindradas);

		System.out.println("Insira a marca da moto");
		marca = leitura.nextLine();
		System.out.println("Insira o modelo da moto");
		modelo = leitura.nextLine();
		
		moto2.atribuirValores(marca, modelo);
		leitura.close();

		moto1.exibirValores();
		moto2.exibirValores();

		} else if (menu.equals("Carro")) {

		System.out.println("Insira a marca do carro");
		var marca = leitura.next();
		System.out.println("Insira o modelo do carro");
		var modelo = leitura.next();
		leitura.close();
		
		carro.atribuirValores(marca, modelo);
		carro.exibirValores();

	}
}
}

