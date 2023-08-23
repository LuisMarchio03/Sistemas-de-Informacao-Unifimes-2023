class Computador {
    private String marca;
    private String modelo;
    private String armazenamento;

    public Computador(String marca, String modelo, String armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }
}

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell", "Inspiron", "512 GB SSD");
        System.out.println("Marca: " + computador1.getMarca());
        System.out.println("Modelo: " + computador1.getModelo());
        System.out.println("Armazenamento: " + computador1.getArmazenamento());
    }
}
