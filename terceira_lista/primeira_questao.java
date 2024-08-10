package terceira_lista;

public class primeira_questao {

    // (1) Desenvolva um algoritmo que some todos os números inteiros compreendidos entre 1 e 10 (inclusive).

    // *Exemplo de execução – Exercício 1 - Caso de teste
    // Somatório:  55
    public static void main(String[] args) {
        
        int somatorio = 0;

        for (int i = 0; i <= 10; i++) {
            somatorio += i;
        }

        System.out.println("Somatório: " + somatorio);
    }
}
