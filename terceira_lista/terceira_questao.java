package terceira_lista;

import java.util.Scanner;

public class terceira_questao {

    // (3) Desenvolva um algoritmo que peça para o usuário inserir vários números inteiros. O algoritmo deverá contabilizar a quantidade de números positivos informados. Caso o usuário digite 0, o algoritmo deve mostrar quantidade contabilizada e encerrar.

    // * Exemplo de execução – Exercício 3 - Caso de teste
    // Insira um número:
    // 5
    // Insira um número:
    // 5
    // Insira um número:
    // -1
    // Insira um número:
    // 0
    // Quantidade de positivos: 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 42;
        int positive_numbers = 0;

        while (number != 0) {
            System.out.println("Insira um número:");
            number = scan.nextInt();
            
            if (number > 0) {
                positive_numbers++;
            }
            
        }
        
        System.out.println("Quantidade de positivos: " + positive_numbers);

        scan.close();
    }
}
