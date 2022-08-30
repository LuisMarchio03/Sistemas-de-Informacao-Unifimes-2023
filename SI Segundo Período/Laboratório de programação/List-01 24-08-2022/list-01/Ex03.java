import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		double fatn = 1;
		double e= 1;
		System.out.println("Escreva o valor de N: ");
		n = entrada.nextInt();
		
			for (int i = 1; i <= n; i++) {
				fatn = fatn * i;
				e = e + 1 / fatn;
		}

		System.out.println(e);		
		
		entrada.close();
	}

}