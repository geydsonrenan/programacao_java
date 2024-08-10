package terceira_lista;

import java.util.Scanner;

public class segunda_questao {

    // (2) Desenvolva um algoritmo que receba dois números inteiros positivos A e B. Exiba na tela todos os números inteiros compreendidos entre A e B, excluindo os próprios A e B. Suponha que o usuário respeite o enunciado e insira valores válidos para A e B.

    // * Exemplo de execução – Exercício 2 - Caso de teste
    // Insira o valor de A:
    // 1
    // Insira o valor de B:
    // 10
    // Série numérica:
    // 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de A:");
        
        int num1 = scan.nextInt();
        
        System.out.println("Insira o valor de B:");
        
        int num2 = scan.nextInt();

        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}
