interface Rentavel {
  double calculaRendimento();
}

public class ContaPoupanca extends ContaBancaria implements Rentavel {
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

  @Override
  public double calculaRendimento() {
    return getSaldo() + (getSaldo() % taxaRendimento);
  }
}
