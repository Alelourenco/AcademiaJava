package ex05_slide56;


import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            int idade;
            String nome;
            Pessoa pessoa;
            
            System.out.println("Deseja cadastrar uma pessoa ?");
            System.out.println("Digite 1 para cadastrar nome e idade");
            System.out.println("Digite 2 somente idade");
            
            
             String menu = leitura.nextLine();


            if (menu.equals("1")) {
                System.out.println("Digite a idade da Pessoa:");
                idade = leitura.nextInt();
                System.out.println("Digite o nome da Pessoa");
                nome = leitura.nextLine();
                nome = leitura.nextLine();
                pessoa = new Pessoa(idade, nome);
            } else if(menu.equals("2")) {
                System.out.println("Digite a idade da Pessoa:");
                idade = leitura.nextInt();
                pessoa = new Pessoa(idade);
                leitura.close();
            }
    }
}
