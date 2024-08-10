package terceira_lista;

import java.util.Scanner;

public class quinta_questao {

    // (5) Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não. A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

    // *Exemplo de execução – Exercício 5 - Caso de teste 1
    // Insira um número:
    // 7
    // 7 é primo.

    // *Exemplo de execução – Exercício 5 - Caso de teste 2
    // Insira um número:
    // 10
    // 10 não é primo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de A:");
        
        int num1 = scan.nextInt();
        
        boolean result = Primo(num1);
        
        if (result == true) {
            System.out.println(num1 + " é primo");
        }
        else {
            System.out.println(num1 + " não é primo");
        }

        scan.close();
    }

    public static boolean Primo(int n) {

        if (n < 2) {
            return true;
        }
        else if (n == 2) {
            return true;
        }
        
        else if (n%2 == 0) {
            return false;
        }
        else {
            for (int i = 3; i <= 7; i+=2) {
                if (n%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
