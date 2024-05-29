import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

  Scanner ref = new Scanner(System.in);
  System.out.println("Digite um número:");
  int num = ref.nextInt();
  int som = calcularSomaDigitosQuadrado(num);
  System.out.println("A soma dos dígitos ao quadrado é:" + som);

  }
  public static int calcularSomaDigitosQuadrado(int num){
  if (num == 0){
  return 0;
  } else {
    int dig = num % 10;
    return dig * dig + calcularSomaDigitosQuadrado(num / 10);
  }
    
  }
  }
  
