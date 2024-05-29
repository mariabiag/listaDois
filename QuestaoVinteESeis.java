import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
		System.out.println("Insira um número: ");
		double numUm = ref.nextDouble ();
	
		System.out.println("Insira outro número: ");
		double numDois = ref.nextDouble();
		
		double soma = numUm + numDois;
		double produto = numUm * (numDois * numDois);
		double produtoUm = numUm * numUm;
		double raizQuadradaSomaDosQuadrados = (numUm * numUm) + (numDois * numDois);
		double seno = (numUm - numDois);
		double  modulo = (numUm);
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("O protudo do primeiro número pelo quadrado do segundo é: " + produto);
		System.out.println("O quadrado do primeiro é: " + produtoUm);
		System.out.println("A raiz quadrada da soma dos quadrados é:" + raizQuadradaSomaDosQuadrados);
		System.out.println("O seno da diferença do número um pelo número dois é: " + seno);
		System.out.println("O modulo do primeiro número é: " + modulo);

	}
	

		
}
