import javax.swing.JOptionPane;
public class Ex02 {
	public static void main(String[] args) {
	menu();
}
public static void menu() {
	int opc,tamc;
	int aux, aux2;
	aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de elementos do vetor A"));
	aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de elementos do vetor B"));
	int[] A = new int[aux];
	int[] B = new int[aux2];
	if (aux<aux2) {
		tamc=aux;
	}else {
		tamc=aux2;
	}
	int[] C = new int[tamc];
	int[] D = new int[aux+aux2];
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma das opções: "
			+ "\n1 - Gerar vetores A e B"
			+ "\n2 - Gerar intercessão entre A e B(vetor C)"
			+ "\n3 - Unir vetores A e B(vetor D)"
			+ "\n4 - Mostrar vetores"
			+ "\n5 - Sair"));
	switch (opc) {
	case 1:
		gerarvetores(A,B);
		break;
	case 2:
		intercessao(A,B,C);
		break;
	case 3:
		unirvetores(A,B,D);
		break;
	case 4:
		mostrarvetores(A,B,C,D);
		break;
	case 5:
		break;
	}
	}while(opc!=5);
}
public static void gerarvetores(int[] vet, int[] vet2) {
	for (int i=0; i<vet.length; i++) {
		vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o elemento "+(i+1)+" do vetor A:"));
	}
	for (int i=0; i<vet2.length; i++) {
		vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o elemento "+(i+1)+" do vetor B:"));
	}
}
public static void intercessao(int[] vet, int[] vet2, int[] vet3) {
	int aux=0;
	for(int i=0;i<vet.length;i++) {
		for(int j=0;j<vet2.length;j++) {
			if(vet[i]==vet2[j]) {
				vet3[aux]=vet[i];
				aux++;
			}
		}
	}
}
public static void unirvetores(int[] vet, int[] vet2, int[] vet3) {
	int aux = 0;
	for(int i=0;i<vet3.length;i++) {
		if(i<vet.length) {
			vet3[i]=vet[i];
		}else {
			vet3[i]=vet2[aux];
			aux++;
		}
	}
}
public static void mostrarvetores(int[] vet, int[] vet2, int[] vet3, int[] vet4) {
	String str, strt = "Vetor A:";
	for(int i = 0;i<vet.length;i++) {
		str = Integer.toString(vet[i]);
		strt = strt + "\n" + str;
	}
	strt = strt + "\n\nVetor B:";
	for(int i = 0; i<vet2.length;i++) {
		str = Integer.toString(vet2[i]);
		strt = strt + "\n" + str;
	}
	strt = strt + "\n\nVetor C:";
	for(int i = 0; i<vet3.length;i++) {
		str = Integer.toString(vet3[i]);
		strt = strt + "\n" + str;
	}
	strt = strt + "\n\nVetor D:";
	for(int i = 0; i<vet4.length;i++) {
		str = Integer.toString(vet4[i]);
		strt = strt + "\n" + str;
	}
    JOptionPane.showMessageDialog(null, strt);
}
}