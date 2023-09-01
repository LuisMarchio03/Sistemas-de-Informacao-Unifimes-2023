import java.util.ArrayList;
import java.util.List;

public class ContaContabil {
  private String nome;
  private double valor;
  private String arquivoLancamentos;
  private List<Lancamento> lancamentos;

  public ContaContabil(String nome, String arquivoLancamentos) {
    this.nome = nome;
    this.valor = 0.0;
    this.arquivoLancamentos = arquivoLancamentos;
    this.lancamentos = new ArrayList<>();
  }

  public void adicionarLancamento(double valor, String descricao) {
    this.valor += valor;
    this.lancamentos.add(new Lancamento(valor, descricao));
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }

  public String getArquivoLancamentos() {
    return arquivoLancamentos;
  }

  public List<Lancamento> getLancamentos() {
    return lancamentos;
  }
}
