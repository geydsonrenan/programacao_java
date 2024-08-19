package quarta_lista;

import java.util.Scanner;

public class quinta_questao {
    // (5) Desenvolva um algoritmo que preencha um vetor numérico de 5 posições. Após preencher todo o vetor, o usuário deve inserir uma chave de busca X. Caso exista algum número igual a X, dentro do vetor, o algoritmo deve mostrar, na tela, o índice da primeira posição na qual X foi encontrado. Caso contrário, o algoritmo deve se encerrar com uma única mensagem, dizendo "Chave não encontrada.".
    // OBS: para essa questão nao é obrigatório usar uma função...

    // * Exemplo de execução – Exercício 5
    // Caso de teste 1
    // Insira o dado da posição  1:
    // 11
    // Insira o dado da posição  2:
    // 12
    // Insira o dado da posição  3:
    // 13
    // Insira o dado da posição  4:
    // 14
    // Insira o dado da posição  5:
    // 15
    // Insira a chave de busca:
    // 15
    // Chave encontrada na posição:  5
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] array;

        array = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o dado da posição " + (i+1) + ":");
            array[i] = scan.nextDouble();
        }

        System.out.println("Insira a chave de busca");

        double chave = scan.nextDouble();

        int result = checar(array, chave);

        if (result == 0) {
            System.out.println("Chave não encontrada");
        }
        else {
            System.out.println("Chave encontrada na posição: " + result);
        }

        scan.close();
    }

    public static int checar(double[] array, double chave) {
        for (int i = 0; i < 5; i++) {
            if (chave == array[i]) {
                return i+1;
            }
        }
        return 0;
    }
}
