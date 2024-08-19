package quarta_lista;

import java.util.Scanner;

public class segunda_questao {
    // (2) Faça o design de uma função "isFirstGreater" que receba três números. No final o programa deve imprimir "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro". OBS: use vetor/array de 3 posicoes para armazenar os numeros lidos.
    //     *Exemplo de execução – Exercício 2
    //     Caso de teste 1
    //     Insira o primeiro número:
    //     3
    //     Insira o segundo número:
    //     2
    //     Insira o terceiro número:
    //     1
    //     Condição satisfeita
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo número:");
        
        int num2 = scan.nextInt();
        
        System.out.println("Insira o terceiro número:");

        int num3 = scan.nextInt();

        int[] array;

        array = new int[3];

        array[0] = num1;
        array[1] = num2;
        array[2] = num3;

        isFirstGreater(array);

        scan.close();

    }

    public static void isFirstGreater(int[] array) {
        if ((array[0] > array[1]) && (array[0] > array[2])) {
            System.out.println("Condição satisfeita");
        }
        else {
            System.out.println("Erro");
        }
    }
}
