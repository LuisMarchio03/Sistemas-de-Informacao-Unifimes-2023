import java.util.Scanner;

public class JogoPedraPapelTesoura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        System.out.print("Digite sua escolha: ");
        int escolhaJogador = scanner.nextInt();

        int escolhaComputador = (int) (Math.random() * 3) + 1;

        System.out.println("Escolha do computador: " + escolhaComputador);

        switch (escolhaJogador) {
            case 1: // Pedra
                if (escolhaComputador == 1) {
                    System.out.println("Empate!");
                } else if (escolhaComputador == 2) {
                    System.out.println("Computador venceu!");
                } else {
                    System.out.println("Jogador venceu!");
                }
                break;
            case 2: // Papel
                if (escolhaComputador == 1) {
                    System.out.println("Jogador venceu!");
                } else if (escolhaComputador == 2) {
                    System.out.println("Empate!");
                } else {
                    System.out.println("Computador venceu!");
                }
                break;
            case 3: // Tesoura
                if (escolhaComputador == 1) {
                    System.out.println("Computador venceu!");
                } else if (escolhaComputador == 2) {
                    System.out.println("Jogador venceu!");
                } else {
                    System.out.println("Empate!");
                }
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
