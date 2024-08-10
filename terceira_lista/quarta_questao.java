package terceira_lista;

import java.util.Scanner;

public class quarta_questao {
    // (4) Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos A e B, no qual A deve ser menor que B (supõe-se que o usuário irá respeitar esse enunciado). O algoritmo deve mostrar, na tela, todos os números ímpares compreendidos entre A e B (inclusive).

    // * Exemplo de execução – Exercício 4 - Caso de teste
    // Insira o valor de A:
    // 1
    // Insira o valor de B:
    // 10
    // É impar: 1
    // É impar: 3
    // É impar: 5
    // É impar: 7
    // É impar: 9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de A:");
        
        int num1 = scan.nextInt();
        
        System.out.println("Insira o valor de B:");
        
        int num2 = scan.nextInt();

        if (num1%2 == 0) {
            num1++;
        }

        for (int i = num1; i <= num2; i+=2) {
            System.out.println("É impar: " + i);
        }

        scan.close();
    }
}
