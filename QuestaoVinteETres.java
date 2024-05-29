import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner ref = new Scanner (System.in);

System.out.println("Digite um valor em metros:");
      double metros = ref.nextDouble();
        

double decímetros = metros * 10;       
double centímetros = metros * 100;
double milímetros = metros * 1000;

System.out.println("O valor em metros é:" + metros);

System.out.println("O valor em decímetros é:" + decímetros);

System.out.println("O valor em centímetros é:" + centímetros);

System.out.println("O valor em milímetros é:" + milímetros);

        }
}
