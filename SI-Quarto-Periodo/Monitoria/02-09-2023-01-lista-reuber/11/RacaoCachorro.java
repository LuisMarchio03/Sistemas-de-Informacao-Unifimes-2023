import java.util.Scanner;

public class RacaoCachorro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o peso do saco de ração (em kg): ");
    double pesoSacoRacao = scanner.nextDouble();

    System.out.print("Informe a quantidade de ração fornecida para cada cachorro (em kg): ");
    double quantidadeRacaoCachorro = scanner.nextDouble();

    double quantidadeRestante = pesoSacoRacao - (5 * 5 * quantidadeRacaoCachorro);

    System.out.println("Quantidade de ração restante após cinco dias: " + quantidadeRestante + " kg");
  }
}
