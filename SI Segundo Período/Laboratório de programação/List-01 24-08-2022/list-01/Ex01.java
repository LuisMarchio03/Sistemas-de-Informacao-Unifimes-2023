import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        System.out.println(lista);
    }
}