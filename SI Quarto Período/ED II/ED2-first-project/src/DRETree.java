import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DRETree {
  private NoConta raiz;

  public DRETree() {
    raiz = new NoConta(new ContaContabil("Demonstração de Resultado do Exercício", ""));
  }

  public NoConta getRaiz() {
    return raiz;
  }

  public void adicionarConta(ContaContabil conta, String[] niveis) {
    NoConta noAtual = raiz;

    for (String nivel : niveis) {
      NoConta proximoNo = null;
      for (NoConta filho : noAtual.getFilhos()) {
        if (filho.getConta().getNome().equals(nivel)) {
          proximoNo = filho;
          break;
        }
      }

      if (proximoNo == null) {
        ContaContabil novaConta = new ContaContabil(nivel, conta.getArquivoLancamentos());
        proximoNo = new NoConta(novaConta);
        noAtual.adicionarFilho(proximoNo);
      }

      noAtual = proximoNo;
    }
  }

  public void exibirDRE() {
    exibirDRERecursivo(raiz, 0);
  }

  private void exibirDRERecursivo(NoConta no, int nivel) {
    for (int i = 0; i < nivel; i++) {
      System.out.print("  ");
    }
    System.out.println(no.getConta().getNome() + ": " + no.getConta().getValor());

    for (NoConta filho : no.getFilhos()) {
      exibirDRERecursivo(filho, nivel + 1);
    }
  }

  public void gravarArquivo(String nomeArquivo) {
    try (PrintWriter writer = new PrintWriter(nomeArquivo)) {
      gravarArquivoRecursivo(writer, raiz, 0);
    } catch (FileNotFoundException e) {
      System.err.println("Erro ao gravar arquivo: " + e.getMessage());
    }
  }

  private void gravarArquivoRecursivo(PrintWriter writer, NoConta no, int nivel) {
    for (int i = 0; i < nivel; i++) {
      writer.print("  ");
    }
    writer.println(no.getConta().getNome() + ": " + no.getConta().getValor());

    for (NoConta filho : no.getFilhos()) {
      gravarArquivoRecursivo(writer, filho, nivel + 1);
    }
  }
}
