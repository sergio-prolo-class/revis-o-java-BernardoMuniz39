package exercicio3;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        int qtd;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a quantidade de alunos: ");
        qtd = teclado.nextInt();

        int [] notas  = new int[qtd];

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        for(int i=0; i<qtd; i++){
            notas[i] = teclado.nextInt();
        }

        int [] a = new int[qtd]; // 0 - 2
        int [] b = new int[qtd]; // 3 - 5
        int [] c = new int[qtd]; // 6 - 8
        int [] d = new int[qtd]; // 9 - 10
        int qtda = 0;
        int qtdb = 0;
        int qtdc = 0;
        int qtdd = 0;

        for(int i=0; i< notas.length; i++){
            if(notas[i] <= 2){
                a[i] = notas[i]; // 0 - 2
                qtda++;
            }else if(notas[i] <= 5){
                b[i] = notas[i]; // 3 - 5
                qtdb++;
            }else if(notas[i] <= 8){
                c[i] = notas[i]; // 6 - 8
                qtdc++;
            }else{
                d[i] = notas[i]; // 9 - 10
                qtdd++;
            }
        }
        //1 1 10 5 6 8 8 9 9 7 7 6 6 6 10 1
        System.out.println("0 - 2 | " + "*".repeat(qtda));
        System.out.println("3 - 5 | " + "*".repeat(qtdb));
        System.out.println("6 - 8 | " + "*".repeat(qtdc));
        System.out.println("9 - 10 | " + "*".repeat(qtdd));
    }
}
