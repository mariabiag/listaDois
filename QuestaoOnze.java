import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in);
		
		System.out.println ("Digite um numero:");
		int num = ref.nextInt();
		
		System.out.println ("A seuqencia é:" + num);
		for (int i = 0; fib(i) <= num; i++) {
	    System.out.println(fib(i) + "");
		}
	}

public static int fib (int n) {
	if (n <= 1) {
	return n;
	
	} else {
		return fib(n-1)+ fib(n-2);
	}

}

		}
