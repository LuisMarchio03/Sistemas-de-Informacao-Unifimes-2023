import java.util.Scanner;


public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = 0,peso =0,maiorAlt=0,menorAlt=0,imc=0 ,imcGrupo, mediaAltura = 0;
        int pessoa=0;
        Character continuar = 's';
        
            
            
            
            while(continuar == 's'){
            System.out.println("Adicionar(S/N): ");
            continuar = entrada.next().charAt(0);
            if(continuar == 'n') break;
            
            System.out.println("Digite sua altura: ");
            altura = entrada.nextDouble();
            System.out.println("Digite sue peso: ");
            peso = entrada.nextFloat();
            if(altura > maiorAlt) maiorAlt = altura;
            if(altura < menorAlt) menorAlt = altura;
            
            
            pessoa++;
            
            imc += (peso/ (altura * altura));
            mediaAltura += altura;
            }
            imcGrupo = imc / pessoa;
            mediaAltura = mediaAltura / pessoa;
            
            System.out.println("Maior Altura: " + maiorAlt + " Menor Altura: " + menorAlt + " IMC médio do grupo: " + imcGrupo);
    }
    }