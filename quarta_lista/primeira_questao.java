package quarta_lista;

import java.util.Scanner;

public class primeira_questao {

    // (1) Faça o design de uma função "maior" que receba dois números [inteiros e positivos] e retorne o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".

    // * Exemplo de execução – Exercício 1
    // Caso de teste 1
    // Insira o primeiro número:
    // 1
    // Insira o segundo número:
    // 2
    // O maior é: 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo número:");

        int num2 = scan.nextInt();

        String result;

        result = Maior(num1, num2);

        System.out.println(result);

        scan.close();


    }

    public static String Maior(int n1, int n2) {
        if (n1 > n2) {
            return "O maior é " + n1;
        }
        else if (n2 > n1) {
            return "O maior é " + n2;
        }
        else {
            return "Os números são iguais";
        }
    }
}
