import java.util.Scanner;

public class OperacoesAritmeticas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor de A: ");
    int a = scanner.nextInt();

    System.out.print("Informe o valor de B: ");
    int b = scanner.nextInt();

    int soma = a + b;
    int subtracao = a - b;
    int multiplicacao = a * b;
    double divisao = (double) a / b;
    int resto = a % b;

    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subtracao);
    System.out.println("Multiplicação: " + multiplicacao);
    System.out.println("Divisão: " + divisao);
    System.out.println("Resto: " + resto);
  }
}
