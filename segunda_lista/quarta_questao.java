package segunda_lista;

import java.util.Scanner;

public class quarta_questao {

    // (4) Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais. Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo. Caso contrário, mostre a soma entre os dois.

    //     * Exemplo de execução – Exercício 4 - Caso de teste 1
    //     Insira o primeiro valor:
    //     2
    //     Insira o segundo valor:
    //     2
    //     Multiplicação:  4

    //     * Exemplo de execução – Exercício 4 - Caso de teste 2
    //     Insira o primeiro valor:
    //     2
    //     Insira o segundo valor:
    //     1
    //     Subtração:  1

    //     * Exemplo de execução – Exercício 4 - Caso de teste 3
    //     Insira o primeiro valor:
    //     1
    //     Insira o segundo valor:
    //     2
    //     Soma:  3
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        
        double num1 = scan.nextDouble();
        
        System.out.println("Insira o segundo número:");
        
        double num2 = scan.nextDouble();
        
        if (num1 == num2) {
            System.out.println("Multiplicação: " + num1*num2);
        }
        else if (num1 > num2) {
            System.out.println("Subtração: " + (num1-num2));
        }
        else {
            System.out.println("Adição: " + (num1+num2));
        }

        scan.close();
    }
}
