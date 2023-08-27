class Televisao {
    String marca;
    String tamanho;
    String resolucao;

    public Televisao(String marca, String tamanho, String resolucao) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao("Samsung", "55 polegadas", "4K");
        System.out.println("Marca: " + tv1.marca + "\nTamanho: " + tv1.tamanho + "\nResolução: " + tv1.resolucao);
    }
}
