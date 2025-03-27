package exercicio2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float a, p1, p2, cf;
        int []w = {2,3};

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da nota do projeto 1: ");
        p1 = teclado.nextFloat();
        System.out.print("Digite o valor da nota do projeto 2: ");
        p2 = teclado.nextFloat();
        System.out.print("Digite o valor da nota de participação: ");
        a= teclado.nextFloat();

        cf = Math.round((p1*w[0] + p2*w[1]/w[0] + w[1]) * 0.9 + (a * 0.1));

        if(cf >= 6 ){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}
