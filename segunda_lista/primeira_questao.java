package segunda_lista;

import java.util.Scanner;

public class primeira_questao {

    // (1) Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".

    // * Exemplo de execução – Exercício 1 - Caso de teste 1
    // Insira o primeiro número:
    // 1
    // Insira o segundo número:
    // 2
    // O maior é: 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        
        double num1 = scan.nextDouble();
        
        System.out.println("Insira o segundo número:");
        
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior é:" + num1);
        }
        else if (num2 > num1) {
            System.out.println("O maior é:" + num2);
        }
        else {
            System.out.println("Os números são iguais");
        }

        scan.close();
    }
}
