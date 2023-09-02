import java.util.Scanner;

public class Circulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o raio do círculo: ");
    double raio = scanner.nextDouble();

    double perimetro = 2 * Math.PI * raio;
    double area = Math.PI * Math.pow(raio, 2);

    System.out.println("Perímetro do círculo: " + perimetro);
    System.out.println("Área do círculo: " + area);
  }
}
