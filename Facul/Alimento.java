public class Alimento extends Produto {
  private String validade;

  public Alimento(String nome, String descricao, double preco, String validade) {
    super(nome, descricao, preco);
    this.validade = validade;
  }

  public String getValidade() {
    return validade;
  }

  public void setValidade(String validade) {
    this.validade = validade;
  }
}
