import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    String nome;
    float soma = 0;
    float num = 0;
    int cont = 0;    
    
    System.out.println("Digite um número");
    num = ent.nextFloat();
    
        
    System.out.println("A soma é " + soma); 
    System.out.println("A quantidade de números digitados foi " + cont);
    System.out.println("A média é " + soma / cont);
  }
}