public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro01", "Autor01", 256);
        System.out.println("Livro: " + livro1.getTitulo + "\nAutor: " + livro1.getAutor + "\nPáginas: " + livro1.getNumPaginas);
    }
}
