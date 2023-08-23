class Filme {
    private String titulo;
    private String diretor;
    private String duracao;

    public Filme(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }
}

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Matrix", "Lana Wachowski", "2h 16m");
        System.out.println("Filme: " + filme1.titulo + "\nDiretor: " + filme1.diretor + "\nDuração: " + filme1.duracao);
    }
}
