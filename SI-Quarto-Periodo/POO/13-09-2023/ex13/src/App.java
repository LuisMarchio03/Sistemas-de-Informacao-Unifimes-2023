// 13. Implemente uma classe Pessoa que tenha atributos como nome, idade e cidade de residência. 
// Crie objetos dessa classe e atribua valores aos seus atributos.

public class App {
    public static void main(String[] args) {
        Person person = new Person("John", 20, "New York");
        Person person2 = new Person("Mary", 18, "Los Angeles");

        System.out.println("\n\nPerson 1: ");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity() + "\n\n");

        System.out.println("Person 2: ");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("City: " + person2.getCity() + "\n\n");
    }
}
