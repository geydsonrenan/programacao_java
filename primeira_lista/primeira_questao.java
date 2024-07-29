package primeira_lista;
import java.util.Scanner;

public class primeira_questao
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		System.out.println("Digite quatro números em sequência:");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		
		int soma;
		
		soma = num1 + num2 + num3 + num4;
		
		System.out.println("Resultado:" + soma);
		
		scan.close();
		
	}
}