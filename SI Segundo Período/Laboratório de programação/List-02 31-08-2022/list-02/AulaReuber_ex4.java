import javax.swing.JOptionPane;
import java.util.Random;
public class AulaReuber_ex4 {
  
public static void main(String[] args) {
	menu();

}
  
public static void menu() {
	int n,qnt=0,opc;
	double media = 0, total = 0;
	n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de elementos do vetor A"));
	int[] v = new int[n];
	do{
	opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma das opções:"
			+ "\n1 - Gerar elemntos da lista"
			+ "\n2 - Calacular media dos elementos"
			+ "\n3 - Elementos acima da media"
			+ "\n4 - Sair"));
	switch (opc) {
	case 1:
		total = gerarelementos(v);
		break;
	case 2:
		calcularmedia(v,media,total);
		break;
	case 3:
		acimamedia(v,media,qnt);
		break;
  case 4:
		break;
	}
}while(opc!=4);
}
  
public static double gerarelementos(int[] vet) {
  double aux = 0;
	Random r = new Random();
	for(int i = 0; i < vet.length; i++) {
		vet[i] = r.nextInt(100);
		aux = aux + vet[i];
	}
  JOptionPane.showMessageDialog(null, aux);
  return aux;
}

public static void calcularmedia(int[] vet, double aux, double aux2) {
	aux = aux2 / vet.length;
  JOptionPane.showMessageDialog(null,"Media simples dos elementos: "+aux);
}
  
public static void acimamedia(int[] vet, double aux, int aux2) {
	System.out.println("Vetor:");
	for(int i=0;i<vet.length;i++) {
		if(vet[i]>aux) {
			aux2++;
		}
	}
    JOptionPane.showMessageDialog(null,"Elementos acima da media: "+aux2);
}
}