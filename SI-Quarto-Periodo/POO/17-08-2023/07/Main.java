class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}

class Agenda {
    List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone, String email) {
        contatos.add(new Contato(nome, telefone, email));
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.nome.equals(nome));
    }
}

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("João", "123456789", "joao@example.com");
        agenda.adicionarContato("Maria", "987654321", "maria@example.com");

        System.out.println("Contatos na agenda:");
        for (Contato contato : agenda.contatos) {
            System.out.println("Nome: " + contato.nome + "\nTelefone: " + contato.telefone + "\nEmail: " + contato.email);
        }

        agenda.removerContato("João");

        System.out.println("\nContatos após a remoção:");
        for (Contato contato : agenda.contatos) {
            System.out.println("Nome: " + contato.nome + "\nTelefone: " + contato.telefone + "\nEmail: " + contato.email);
        }
    }
}
