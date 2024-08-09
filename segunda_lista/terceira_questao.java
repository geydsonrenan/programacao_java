package segunda_lista;

import java.util.Scanner;

public class terceira_questao {
    
    // (3) Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.

    //     *Exemplo de execução – Exercício 3 - Caso de teste 1
    //     Insira um número:
    //     2
    //     2 é par.

    //     *Exemplo de execução – Exercício 3 - Caso de teste 2
    //     Insira um número:
    //     3
    //     3 é impar.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o número:");
        
        int num1 = scan.nextInt();
        
        if (num1%2 == 0) {
            System.out.println(num1 + " é par");
            
        }
        else {
            System.out.println(num1 + " é impar");
        }
        
        scan.close();
    }
}
