class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Rex", "Cachorro", 3);
        System.out.println("Nome: " + animal1.nome + "\nEspécie: " + animal1.especie + "\nIdade: " + animal1.idade + " anos");
    }
}
