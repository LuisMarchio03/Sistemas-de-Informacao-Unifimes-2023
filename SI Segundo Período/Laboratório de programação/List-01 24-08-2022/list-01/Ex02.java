import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String valor = "0";
    double media = 0;
    double soma = 0;
    Integer count = 0;
    double salario = 0;

    do {
        System.out.print("Informe o Valor do Salário: ");
        valor = sc.next().replace("," , ",");

        salario = Double.parseDouble(valor);

        soma += salario;
        count++;

    } while (salario != 0);
    count = count -1;
    media = soma / count;
    System.out.printf("A média dos salários é: %.2f", media);
    System.out.println();

    sc.close();
    }
}