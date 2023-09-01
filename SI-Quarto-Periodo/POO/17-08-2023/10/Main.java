class Produto {
    private String nome;
    private double preco;
    private int estoque;

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

class Loja {
    List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int estoque) {
        produtos.add(new Produto(nome, preco, estoque));
    }

    public int verificarEstoque(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.nome.equals(nomeProduto)) {
                return produto.estoque;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarProduto("Celular", 999.99, 10);
        loja.adicionarProduto("Fone de Ouvido", 49.99, 30);

        System.out.println("Estoque dos produtos:");
        System.out.println("Celular: " + loja.verificarEstoque("Celular") + " unidades");
        System.out.println("Fone de Ouvido: " + loja.verificarEstoque("Fone de Ouvido") + " unidades");
    }
}
