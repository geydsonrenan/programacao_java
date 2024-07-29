package primeira_lista;

import java.util.Scanner;

public class segunda_questao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.println("Digite as três notas:");

        nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();

        double mean;

        mean = (nota1 + nota2 + nota3)/3;

        System.out.println("Média das notas:" + mean);

        scan.close();
    }
}
