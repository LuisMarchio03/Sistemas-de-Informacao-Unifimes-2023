class Casa {
    private String endereco;
    private int numQuartos;
    private double area;

    public Casa(String endereco, int numQuartos, double area) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area = area;
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Rua Principal 123", 3, 150);
        System.out.println("Endereço: " + casa1.endereco + "\nNúmero de quartos: " + casa1.numQuartos + "\nÁrea: " + casa1.area + " m²");
    }
}
