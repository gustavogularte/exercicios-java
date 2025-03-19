public class ContaCorrente extends ContaBancaria {
  private int quantidadeTransacoes = 0;

  public ContaCorrente(String senha) {
    super(senha);
  }

  @Override
  public void sacar(double valor) {
    setSaldo(getSaldo() - valor);
    quantidadeTransacoes++;
  }

  @Override
  public void depositar(double valor) {
    setSaldo(getSaldo() + valor);
    quantidadeTransacoes++;
  }

  @Override
  public void tiraExtrato() {

  }

  public int getQuantidadeTransacoes() {
    return quantidadeTransacoes;
  }
}
