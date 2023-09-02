import java.util.Scanner;

public class IncrementoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Informe o percentual de aumento para o funcionário: ");
        double percentualAumento = scanner.nextDouble();

        double novoSalario = salarioAtual * (1 + percentualAumento / 100);

        System.out.println("O novo salário do funcionário é: " + novoSalario);
    }
}
