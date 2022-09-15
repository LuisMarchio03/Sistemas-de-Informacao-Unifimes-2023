import javax.swing.JOptionPane;
import java.util.Random;
public class Ex03 {
public static void main(String[] args) {
	menu();
}
public static void menu() {
	int n, opc;
	n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de elementos do vetor"));
	int[] v = new int[n];
	do{
		opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma das opções:"
				+ "\n1 - Gerar elemntos da lista"
				+ "\n2 - Calacular desvio padrão"
				+ "\n3 - Sair"));
		switch (opc) {
		case 1:
			gerarelementos(v);
			break;
		case 2:
			desviopadrao(v);
			break;
		case 3:
			break;
		}
	}while(opc!=3);
}
public static void gerarelementos(int[] vet) {
	Random r = new Random();
	for(int i = 0; i < vet.length; i++) {
		vet[i] = r.nextInt(100);
	}
}
public static void desviopadrao(int[] vet) {
	int soma = 0, soma2 = 0;
	double dp;
	for(int i = 0;i<vet.length;i++) {
		soma = soma + vet[i];
	}
	soma = soma / vet.length;
	for(int i = 0;i<vet.length;i++) {
		soma2 = soma2 + (vet[i] - soma)^2;
	}
	soma2 = soma2 / vet.length;
	dp = soma2 ^ (1/2);
    JOptionPane.showMessageDialog(null,"Desvio padrão dos elementos do vetor: "+dp);

}
}
