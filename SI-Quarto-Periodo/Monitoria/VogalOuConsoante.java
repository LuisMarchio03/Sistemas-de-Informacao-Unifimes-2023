import java.util.Scanner;

public class VogalOuConsoante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("A letra é uma vogal.");
                break;
            default:
                System.out.println("A letra é uma consoante.");
        }

        scanner.close();
    }
}
