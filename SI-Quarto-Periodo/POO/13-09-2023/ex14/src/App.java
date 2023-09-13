// 14. Crie uma classe Círculo com um atributo de raio e um método para calcular a área desse círculo. 
// Instancie um objeto dessa classe e calcule a área.

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("A área do círculo é: " + area);
    }
}
