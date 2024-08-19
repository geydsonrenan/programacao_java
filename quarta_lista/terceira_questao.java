package quarta_lista;

import java.util.Scanner;

public class terceira_questao {
    // (3) Faça o design de uma função "parImpar" que receba um número inteiro e verifique se esse número é par ou ímpar.
    // *Exemplo de execução – Exercício 3
    // Caso de teste 1
    // Insira um número:
    // 2
    // 2 é par.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número:");

        int n = scan.nextInt();

        parImpar(n);

        scan.close();
    }

    public static void parImpar(int n) {
        if (n%2 == 0) {
            System.out.println(n + " é par");
        }
        else {
            System.out.println(n + " é ímpar");
        }
    }
}
