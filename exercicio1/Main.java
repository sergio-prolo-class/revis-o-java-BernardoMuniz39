package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome;
        int ano;
        int anoatual;
        int idade;

        System.out.print("Entre com seu nome: ");
        nome = teclado.next();

        System.out.print("Entre com o ano que nasceu: ");
        ano = teclado.nextInt();

        System.out.print("Entre com o ano atual: ");
        anoatual = teclado.nextInt();

        idade = anoatual - ano;

        System.out.println(nome + " tem " + idade + " anos." );
    }
}