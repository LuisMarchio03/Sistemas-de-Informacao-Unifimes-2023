// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects of the Carro class
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Ford", "Mustang", 2023);

        // Display characteristics of the cars
        System.out.println("Car 1:");
        System.out.println("Brand: " + carro1.getMarca());
        System.out.println("Model: " + carro1.getModelo());
        System.out.println("Year: " + carro1.getAno());

        System.out.println();

        System.out.println("Car 2:");
        System.out.println("Brand: " + carro2.getMarca());
        System.out.println("Model: " + carro2.getModelo());
        System.out.println("Year: " + carro2.getAno());
    }
}
