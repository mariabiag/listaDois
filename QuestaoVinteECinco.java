import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner(System.in);

System.out.println("Digite a temperatura em Fahrenheit:");
double fahrenheit = ref.nextDouble();

        // Fórmula para que utilizamos para calcular a temperatura em Celsius C = (F - 32) * 5/9

    double celsius = (fahrenheit - 32) *5/9;
      
System.out.println("A temperatura em Celsius é:" + celsius);
    }
}
      
