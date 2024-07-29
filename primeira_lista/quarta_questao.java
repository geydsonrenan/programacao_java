package primeira_lista;

import java.util.Scanner;

public class quarta_questao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Insira o valor da Base:");

        base = scan.nextDouble();

        System.out.println("Insira o valor da Altura:");
        
        altura = scan.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("Área do Triângulo: " + area);

        scan.close();

    }
}
