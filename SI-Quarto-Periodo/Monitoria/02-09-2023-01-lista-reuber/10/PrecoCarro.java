import java.util.Scanner;

public class PrecoCarro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o custo de fábrica do carro: ");
    double custoFabrica = scanner.nextDouble();

    double imposto = custoFabrica * 0.45;
    double lucroDistribuidor = custoFabrica * 0.12;
    double precoConsumidor = custoFabrica + imposto + lucroDistribuidor;

    System.out.println("Preço ao consumidor: " + precoConsumidor);
    System.out.println("Valor do imposto: " + imposto);
    System.out.println("Lucro do distribuidor: " + lucroDistribuidor);
  }
}
