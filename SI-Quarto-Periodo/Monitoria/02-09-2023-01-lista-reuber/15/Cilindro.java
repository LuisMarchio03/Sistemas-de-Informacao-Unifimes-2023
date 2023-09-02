import java.util.Scanner;

public class Cilindro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o raio do cilindro: ");
    double raio = scanner.nextDouble();

    System.out.print("Informe a altura do cilindro: ");
    double altura = scanner.nextDouble();

    double volume = Math.PI * Math.pow(raio, 2) * altura;
    double areaLateral = 2 * Math.PI * raio * altura;

    System.out.println("Volume do cilindro: " + volume);
    System.out.println("Área lateral do cilindro: " + areaLateral);
  }
}
