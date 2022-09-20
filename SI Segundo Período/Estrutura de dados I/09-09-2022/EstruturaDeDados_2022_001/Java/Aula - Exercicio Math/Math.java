import java.util.Scanner;

public class Math {
    public static void main(String[] args) throws Exception {
        //Vetor para armazenas os números informados pelo usuário
        int lista[] = new int[20];
        //Vertor para armazenar os números classificados como pares
        int par[] = new int[20];
        //Vertor para armazenar os números classificados como impares
        int impar[] = new int[20];
        //Vetor para juntar o vetor par e impar
        int listaNova[] = new int[20];
        
        int posicaoPar = 0;
        int posicaoImpar = 0;
        int aux = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para informar 20 numeros aleatorios");
        for(int i = 0; i < 20;i++){            
            System.out.println("Informe o " + (i+1) + "º numero");
            lista[i] = teclado.nextInt();
        }

        System.out.print("Números digitados: ");
        for(int i = 0; i < lista.length; i++){
            System.out.print(lista[i]+" | ");
        }
        System.out.println();
        
        //Separo o vetor de números inseridos em pares e impares
        for(int i = 0; i < lista.length;i++){
            if (lista[i]%2 ==0){
                par[posicaoPar] = lista[i];
                posicaoPar++;
            } else {
                impar[posicaoImpar] = lista[i];
                posicaoImpar++;
            }            
        }
        
        //Impressão no console dos números pares
        System.out.print("Números pares: ");
        for(int i = 0; i < par.length; i++){
            System.out.print(par[i] + " | ");
        }
        System.out.println();
        
        //Impressão no console dos números impares
        System.out.print("Números impares: ");
        for(int i = 0; i < impar.length; i++){
            System.out.print(impar[i]+" | ");
        }
        System.out.println();

        //Forma número 1 de concatenar
        for(int i = 0; i < posicaoPar;i++){            
            listaNova[i] = par[i];
        }
        aux = posicaoPar;
        for(int i = 0; i < posicaoImpar;i++){            
            listaNova[aux] = impar[i];
            aux++;
        }

        //Impressão no console dos números impares
        System.out.print("Nova lista: ");
        for(int i = 0; i < listaNova.length; i++){
            System.out.print(listaNova[i]+" | ");
        }
        System.out.println();
        
    }
}
