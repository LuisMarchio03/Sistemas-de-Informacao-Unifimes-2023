import javax.swing.JOptionPane;
import java.util.Random;
public class Ex01 {
public static void main(String[] args) {
	menu();
}
public static void menu() {
	int opc = 0;
	int[] vetor = new int[100];
	int[] vetor2 = new int[100];
    do {
    	opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Herança - Menu de Opções"
    
    		+ "\n\t1 - Gerar lista"
            + "\n\t2 - Gerar lista invertida"
            + "\n\t3 - Mostrar listas"
            + "\n\t4 - Sair"
            + "\n\n\t Escolha uma Opção!"));
    switch (opc) {
    case 1:
    	gerarvetor(vetor);
    	break;
    case 2:
    	vetorinvertido(vetor, vetor2);
    	break;
    case 3:
    	mostrarvetores(vetor, vetor2);
    	break;
    case 4:
    	break;
    	}
    } while (opc!=4);
}
public static void gerarvetor(int[] v) {
	Random r = new Random();
	for(int i = 0; i < v.length; i++) {
		v[i] = r.nextInt(100);
	}
}
public static void vetorinvertido(int[] v, int[] v2) {
	int j = v.length - 1;
	for(int i = 0;i < v.length;i++) {
		v2[j] = v[i];
		j--;
	}
}
public static void mostrarvetores(int[] v, int[] v2) {
	String str, strt = "Vetor:";
	for(int i = 0;i<v.length;i++) {
		str = Integer.toString(v[i]);
		strt = strt + "\n" + str;
	}
	strt = strt + "\n\nVetor invertido:";
	for(int i = 0; i<v2.length;i++) {
		str = Integer.toString(v2[i]);
		strt = strt + "\n" + str;
	}
    JOptionPane.showMessageDialog(null, strt);

}
}