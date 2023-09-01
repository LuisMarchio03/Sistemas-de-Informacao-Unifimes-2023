import java.util.Scanner;

public class LojaVirtual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0.0;

        while (true) {
            System.out.println("Bem-vindo à Loja Virtual!");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Finalizar compra");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Produtos disponíveis:");
                    System.out.println("1. Camiseta - R$20.00");
                    System.out.println("2. Calça jeans - R$50.00");
                    System.out.println("3. Tênis - R$80.00");
                    System.out.print("Escolha um produto: ");
                    int produto = scanner.nextInt();

                    switch (produto) {
                        case 1:
                            totalCompra += 20.00;
                            break;
                        case 2:
                            totalCompra += 50.00;
                            break;
                        case 3:
                            totalCompra += 80.00;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Total da compra: R$" + totalCompra);
                    totalCompra = 0.0; // Zera o total para futuras compras
                    break;

                case 3:
                    System.out.println("Obrigado por visitar nossa loja!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
