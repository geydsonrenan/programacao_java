package primeira_lista;

import java.util.Scanner;

public class terceira_questao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario;

        System.out.println("Digite o valor do salário:");

        salario = scan.nextDouble();

        double resultado;

        resultado = (salario*0.25) + salario;

        System.out.println("Salario + 25%: " + resultado);

        scan.close();

    }
}
