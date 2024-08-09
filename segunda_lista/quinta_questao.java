package segunda_lista;

import java.util.Scanner;

public class quinta_questao {

    // (5) Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre: 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá processar dois números inteiros por vez.

    // * Exemplo de execução – Exercício 5 - Caso de teste 1
    // Digite 1 para somar;
    // Digite 2 para subtrair;
    // Digite 3 para multiplicar;
    // Digite 4 para dividir;
    // 1
    // Insira o primeiro valor:
    // 1
    // Insira o segundo valor:
    // 2
    // Soma: 3

    // * Exemplo de execução – Exercício 5 - Caso de teste 2
    // Digite 1 para somar;
    // Digite 2 para subtrair;
    // Digite 3 para multiplicar;
    // Digite 4 para dividir;
    // 2
    // Insira o primeiro valor:
    // 2
    // Insira o segundo valor:
    // 1
    // Subtração: 1

    // * Exemplo de execução – Exercício 5 - Caso de teste 3
    // Digite 1 para somar;
    // Digite 2 para subtrair;
    // Digite 3 para multiplicar;
    // Digite 4 para dividir;
    // 3
    // Insira o primeiro valor:
    // 2
    // Insira o segundo valor:
    // 2
    // Multiplicação: 4
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para somar;\r\n" +
                        "Digite 2 para subtrair;\r\n" + 
                        "Digite 3 para multiplicar;\r\n" +
                        "Digite 4 para dividir;");

        int choice = scan.nextInt();

        System.out.println("Insira o primeiro número:");
        
        double num1 = scan.nextDouble();
        
        System.out.println("Insira o segundo número:");
        
        double num2 = scan.nextDouble();
        
        switch (choice) {
            case 1:
                System.out.println("Soma: " + (num1+num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1*num2));
                break;
            case 4:
                System.out.println("Divisão: " + (num1/num2));
                break;
        }

        scan.close();
    }
}
