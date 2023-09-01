class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "202101", 8.5);
        Aluno aluno2 = new Aluno("Maria", "202102", 9.0);
        double media = (aluno1.getNota() + aluno2.getNota()) / 2;
        System.out.println("Média: " + media);
    }
}
