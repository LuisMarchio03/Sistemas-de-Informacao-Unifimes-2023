import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinhar = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.print("Tente adivinhar o número entre 1 e 100: ");

        int tentativa = scanner.nextInt();
        while (tentativa != numeroAdivinhar) {
            if (tentativa < numeroAdivinhar) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
            System.out.print("Nova tentativa: ");
            tentativa = scanner.nextInt();
        }

        System.out.println("Parabéns! Você acertou o número.");
        scanner.close();
    }
}
