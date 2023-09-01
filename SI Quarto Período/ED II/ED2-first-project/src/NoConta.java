import java.util.ArrayList;
import java.util.List;

public class NoConta {
  private ContaContabil conta;
  private List<NoConta> filhos;

  public NoConta(ContaContabil conta) {
    this.conta = conta;
    this.filhos = new ArrayList<>();
  }

  public ContaContabil getConta() {
    return conta;
  }

  public List<NoConta> getFilhos() {
    return filhos;
  }

  public void adicionarFilho(NoConta filho) {
    filhos.add(filho);
  }
}
