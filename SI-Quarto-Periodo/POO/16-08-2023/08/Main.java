public class Main {
    public static void main(String[] args) {
        // Create objects of the Pessoa class
        Pessoa pessoa1 = new Pessoa("Alice", 25, "Engineer");
        Pessoa pessoa2 = new Pessoa("Bob", 30, "Teacher");

        // Display information about the objects
        System.out.println("Person 1:");
        System.out.println("Name: " + pessoa1.getNome());
        System.out.println("Age: " + pessoa1.getIdade());
        System.out.println("Profession: " + pessoa1.getProfissao());

        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + pessoa2.getNome());
        System.out.println("Age: " + pessoa2.getIdade());
        System.out.println("Profession: " + pessoa2.getProfissao());
    }
}
