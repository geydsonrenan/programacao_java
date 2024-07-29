package primeira_lista;

import java.util.Scanner;


public class quinta_questao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.println("Insira o primeiro número:");
        
        num1 = scan.nextDouble();
        
        System.out.println("Insira o segundo número:");
        
        num2 = scan.nextDouble();
        
        resultado = Math.pow(num1, num2);
        
        System.out.println("O resultado do primeiro número elevado ao segundo é: " + resultado);

        scan.close();

    }
}
