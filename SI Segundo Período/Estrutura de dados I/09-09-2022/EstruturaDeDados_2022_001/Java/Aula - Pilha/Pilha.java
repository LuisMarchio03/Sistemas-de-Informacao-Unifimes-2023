
import java.util.Scanner;

/**
 *
 * @author alencarburiti
 */
public class Pilha {

    //Definindo a classe que representará 
    //cada elemento da pilha 
    public String nome;
    public Pilha prox;
    public Pilha topo = null;
    public Pilha aux;
    
    public void push(String nome) {        
        Pilha novo = new Pilha();
        novo.nome = nome;
        novo.prox = topo;
        topo = novo;
        System.out.println("Número inserido na ... pilha!!");
    }

    public void pop() {
        if (topo == null) {
            // a pilha está vazia 
            System.out.println("Pilha vazia!! ");
        } else {
            // a pilha contém elementos 
            // e o último elemento inserido 
            // será removido 
            System.out.println("Número " + topo.nome + " .... removido");
            topo = topo.prox;
        }
    }

    public void esvaziarLista() {
        if (topo == null) {
            // a pilha está vazia 
            System.out.println("Pilha vazia! ! ");
        } else {
            // a pilha será esvaziada 
            topo = null;
            System.out.println("Pilha esvaziada");
        }
    }

    public void listarPilha() {
        if (topo == null) {
            // a pilha está vazia 
            System.out.println("Pilha vazia !!");
        } else {
            // a pilha contém elementos e 
            // estes serão mostrados 
            // do último inserido ao primeiro 
            System.out.println("Consultando a .... pilha");
            aux = topo;
            while (aux != null) {
                System.out.println(aux.nome + " ");
                aux = aux.prox;
            }
        }
    }
}
