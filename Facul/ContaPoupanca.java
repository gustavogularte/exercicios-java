public class ContaPoupanca extends ContaBancaria {
  private double taxaRendimento = 0.5;

  public ContaPoupanca(String senha) {
    super(senha);
  }

  @Override
  public void sacar(double valor) {
    setSaldo(getSaldo() - valor);
  }

  @Override
  public void depositar(double valor) {
    setSaldo(getSaldo() + valor);
  }

  @Override
  public void tiraExtrato() {

  }

  public double getTaxaRendimento() {
    return taxaRendimento;
  }
}
