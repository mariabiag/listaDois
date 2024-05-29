import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

  Scanner ref = new Scanner(System.in);
  System.out.println("Digite as medidas dos tres lados: ");
    
  System.out.println("Lado 1:");
    double ladoUm = ref.nextDouble();

  System.out.println("Lado 2:");
  double ladoDois = ref.nextDouble();

  System.out.println("Lado 3:");
    double ladoTres = ref.nextDouble();

    if (ladoUm == ladoDois && ladoDois  == ladoTres && ladoTres == ladoUm){
  System.out.println("O triangulo é equilatero");

    }else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoTres == ladoUm){
    System.out.println("O triangulo é isosceles");
    } else {
      System.out.println("O triangulo é escaleno");
    }
      
    }
  
    }
