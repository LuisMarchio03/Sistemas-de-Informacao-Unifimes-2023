
public class No { // todo no de lista tem um campo de informação
    // e um de próximo elemento.
    int info, prox;    

    No(int info) {
        this.info = info;
        prox = -1;
    }

    public String toString() {
        return info + "\t";
    }
}