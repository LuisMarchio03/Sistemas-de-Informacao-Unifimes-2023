// 15. Crie uma classe Retângulo com atributos de largura e altura e métodos para calcular a área e o perímetro. 
// Garanta que a largura e a altura não possam ser atribuídas diretamente fora da classe.

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimeter);
    }
}
