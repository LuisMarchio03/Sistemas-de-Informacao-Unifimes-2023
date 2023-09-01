public class Lancamento {
  private double valor;
  private String descricao;

  public Lancamento(double valor, String descricao) {
    this.valor = valor;
    this.descricao = descricao;
  }

  public double getValor() {
    return valor;
  }

  public String getDescricao() {
    return descricao;
  }
}
