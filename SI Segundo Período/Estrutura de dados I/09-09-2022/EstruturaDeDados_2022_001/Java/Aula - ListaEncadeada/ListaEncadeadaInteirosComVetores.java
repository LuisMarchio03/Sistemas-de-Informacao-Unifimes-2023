package ListaEncadeada;

public class ListaEncadeadaInteirosComVetores {
    // O "tamanho" da lista é 10 neste caso.

    private final int TAM_MAX_LISTA = 10;
    // A lista propriamente dita.
    No[] lista;
    // O primeiro indice da lista.
    int prim;
    // Inicialmente, a lista não possui nenhum elemento.

    public ListaEncadeadaInteirosComVetores() {
        lista = new No[TAM_MAX_LISTA];
        prim = -1;
    }

    void insereNoInicio(int info) {
        int i;
        // Acha a primeira posição livre do vetor.
        for (i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                break;
            }
        }
        // Se encontrou uma posição livre, faça prim apontar para esta
        // posição e o campo prox deve ser atualizado.
        if (i < lista.length) {
            lista[i] = new No(info);
            lista[i].prox = prim;
            prim = i;
        }
    }

    int removeDoInicio() {
        // Se a lista está vazia, retorne uma constante que significa erro.
        if (prim == -1) {
            return Integer.valueOf(Integer.MIN_VALUE);
        }
        // Senão, retire o primeiro elemento da lista, atualizando prim.
        int resp = lista[prim].info, ind = prim;
        prim = lista[prim].prox;
        lista[ind] = null;
        return resp;
    }

    void insereNoFim(int info) {
        int i;
        // Acha a primeira posição livre do vetor.
        for (i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                break;
            }
        }
        // Senão, insira na última posição da lista.
        if (i < lista.length) {
            lista[i] = new No(info);
            int q = prim, ant = prim;
            // Procure a última posição da lista marcada com ant.
            while (q != -1) {
                ant = q;
                q = lista[q].prox;
            }
            // Se a lista está vazia, a inserção será na posição zero.
            if (ant == -1) {
                prim = i;
            } // Senão, a inserção deve ser na posição correta.
            else {
                lista[ant].prox = i;
            }
        }
    }

    int removeDoFim() {
        // Se a lista está vazia, retorne uma constante que significa erro.
        if (prim == -1) {
            return Integer.valueOf(Integer.MIN_VALUE);
        }
        int q = prim, ant = prim;
        // Senão, retire o último elemento da lista.
        // Ache a posição do último elemento.
        while (lista[q].prox != -1) {
            ant = q;
            q = lista[q].prox;
        }
        // Se só tem um elemento, retire-o da lista e atualiza prim.
        int resp = lista[ant].info;
        if (ant == prim) {
            prim = -1;
            lista[ant] = null;
        } // Senão, faça o penúltimo ser o último elemento da lista.
        else {
            int ind = lista[ant].prox;
            lista[ant].prox = -1;
            lista[ind] = null;
        }
        return resp;
    }
    // A lista está vazia se prim está com o valor igual a -1.

    boolean estaVazia() {
        return prim == -1;
    }
    // A impressão usa toString de nó. A ideia é passar por cada
    // elemento imprimindo a informação.

    public String toString() {
        String resp = "";
        int ind = prim;
        while (ind != -1) {
            resp += lista[ind].toString();
            ind = lista[ind].prox;
        }
        return resp;
    }
}
