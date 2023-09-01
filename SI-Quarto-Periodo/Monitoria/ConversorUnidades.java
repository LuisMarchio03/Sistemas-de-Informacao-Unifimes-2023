import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Unidades");
        System.out.println("1. Converter Celsius para Fahrenheit");
        System.out.println("2. Converter Quilômetros para Milhas");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsius * 9/5 + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Digite a distância em Quilômetros: ");
                double quilometros = scanner.nextDouble();
                double milhas = quilometros * 0.621371;
                System.out.println("Distância em Milhas: " + milhas);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
