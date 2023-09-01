import java.util.Scanner;

public class Menu {
  private DRETree dreTree;
  private Scanner scanner;

  public Menu(DRETree dreTree) {
    this.dreTree = dreTree;
    this.scanner = new Scanner(System.in);
  }

  public void exibir() {
    while (true) {
      System.out.println("MENU:");
      System.out.println("1. Adicionar Conta Contábil");
      System.out.println("2. Adicionar Lançamento a Conta Contábil");
      System.out.println("3. Exibir DRE");
      System.out.println("4. Gravar DRE em Arquivo");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar a quebra de linha

      switch (opcao) {
        case 1:
          adicionarContaContabil();
          break;
        case 2:
          adicionarLancamento();
          break;
        case 3:
          dreTree.exibirDRE();
          break;
        case 4:
          gravarDRE();
          break;
        case 5:
          System.out.println("Encerrando o programa.");
          return;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    }
  }

  private void adicionarContaContabil() {
    System.out.print("Digite o nome da nova conta contábil: ");
    String nomeConta = scanner.nextLine();
    System.out.print("Digite o nome do arquivo de lançamentos para esta conta: ");
    String arquivoLancamentos = scanner.nextLine();

    ContaContabil novaConta = new ContaContabil(nomeConta, arquivoLancamentos);

    System.out.print("Digite os níveis da conta contábil (separados por vírgula): ");
    String niveisInput = scanner.nextLine();
    String[] niveis = niveisInput.split(",");

    dreTree.adicionarConta(novaConta, niveis);
    System.out.println("Conta contábil adicionada com sucesso.");
  }

  private void adicionarLancamento() {
    dreTree.exibirDRE();
    System.out.print("Digite o nome da conta contábil para adicionar o lançamento: ");
    String nomeConta = scanner.nextLine();
    NoConta noConta = buscarConta(dreTree.getRaiz(), nomeConta);

    if (noConta != null) {
      System.out.print("Digite o valor do lançamento: ");
      double valor = scanner.nextDouble();
      scanner.nextLine(); // Limpar a quebra de linha
      System.out.print("Digite a descrição do lançamento: ");
      String descricao = scanner.nextLine();

      noConta.getConta().adicionarLancamento(valor, descricao);
      System.out.println("Lançamento adicionado com sucesso.");
    } else {
      System.out.println("Conta contábil não encontrada.");
    }
  }

  private NoConta buscarConta(NoConta no, String nomeConta) {
    if (no.getConta().getNome().equals(nomeConta)) {
      return no;
    }

    for (NoConta filho : no.getFilhos()) {
      NoConta resultadoBusca = buscarConta(filho, nomeConta);
      if (resultadoBusca != null) {
        return resultadoBusca;
      }
    }

    return null;
  }

  private void gravarDRE() {
    System.out.print("Digite o nome do arquivo para gravar a DRE: ");
    String nomeArquivo = scanner.nextLine();
    dreTree.gravarArquivo(nomeArquivo);
    System.out.println("DRE gravada com sucesso no arquivo " + nomeArquivo);
  }
}
