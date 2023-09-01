import java.util.Scanner;

public class MenuOpcoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Opções");
        System.out.println("1. Exibir mensagem");
        System.out.println("2. Realizar cálculo simples");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu exibir uma mensagem.");
                break;
            case 2:
                System.out.print("Digite um número: ");
                double num = scanner.nextDouble();
                double resultado = num * 2;
                System.out.println("O dobro do número é: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
