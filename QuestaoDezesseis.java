import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
		System.out.println("Insira um número: ");
		int num = ref.nextInt();
		
	if (num == 2) {
		System.out.println ("O númerom é primo:");
		
	}else if (num % 2 == 0){
		System.out.println("O número náo é um número primo:");
		
	} else {
	 System.out.println("O número é primo");
	}
	}
	

		
}
