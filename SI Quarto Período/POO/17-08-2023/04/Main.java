class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void comprarProduto(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Compra realizada: " + quantidade + " unidades de " + nome);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Calça", 49.99, 30);

        produto1.comprarProduto(3);
        System.out.println("Estoque atual de " + produto1.nome + ": " + produto1.estoque);
    }
}
