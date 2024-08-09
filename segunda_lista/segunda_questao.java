package segunda_lista;

import java.util.Scanner;

public class segunda_questao {

    // (2) Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".

    // *Exemplo de execução – Exercício 2 - Caso de teste 1
    // Insira o primeiro número:
    // 3
    // Insira o segundo número:
    // 2
    // Insira o terceiro número:
    // 1
    // Condição satisfeita
    // *Exemplo de execução – Exercício 2 - Caso de teste 2
    // Insira o primeiro número:
    // 2
    // Insira o segundo número:
    // 3
    // Insira o terceiro número:
    // 1
    // Erro
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        
        double num1 = scan.nextDouble();
        
        System.out.println("Insira o segundo número:");
        
        double num2 = scan.nextDouble();
        
        System.out.println("Insira o terceiro número:");
        
        double num3 = scan.nextDouble();
        
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Condição satisfeita");
        }
        else {
            System.out.println("Erro");
        }
        
        scan.close();
    }
}