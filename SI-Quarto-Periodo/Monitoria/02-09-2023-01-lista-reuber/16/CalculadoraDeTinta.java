import java.util.Scanner;

public class CalculadoraDeTinta {
    public static void main(String[] args) {
        // Defina o custo por lata de tinta e a capacidade de cada lata em litros
        double custoPorLata = 50.00;
        double capacidadePorLata = 5.0; // litros por lata

        // Crie um Scanner para entrada de usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário as dimensões do tanque
        System.out.print("Digite o raio do tanque em metros: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do tanque em metros: ");
        double altura = scanner.nextDouble();

        // Calcule a área da superfície do tanque em metros quadrados
        double areaSuperficie = 2 * Math.PI * raio * (raio + altura);

        // Calcule a quantidade de litros de tinta necessária
        double litrosDeTintaNecessarios = areaSuperficie / 3; // 3 m² por litro

        // Calcule o número de latas de tinta necessárias
        int latasNecessarias = (int) Math.ceil(litrosDeTintaNecessarios / capacidadePorLata);

        // Calcule o custo total
        double custoTotal = latasNecessarias * custoPorLata;

        // Exiba o resultado
        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Custo total: R$" + custoTotal);

        // Feche o Scanner
        scanner.close();
    }
}
