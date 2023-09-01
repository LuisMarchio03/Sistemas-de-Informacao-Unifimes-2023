public class Main {
    public static void main(String[] args) {
        // Creating objects of Cachorro class
        Cachorro dog1 = new Cachorro("Buddy", "Golden Retriever", 3);
        Cachorro dog2 = new Cachorro("Max", "Labrador", 2);

        // Display details of dogs
        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.getNome());
        System.out.println("Breed: " + dog1.getRaca());
        System.out.println("Age: " + dog1.getIdade());

        System.out.println();

        System.out.println("Dog 2:");
        System.out.println("Name: " + dog2.getNome());
        System.out.println("Breed: " + dog2.getRaca());
        System.out.println("Age: " + dog2.getIdade());
    }
}
