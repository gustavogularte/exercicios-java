import java.util.Scanner;

public abstract class ContaBancaria {
  private String senha;
  private String numero;
  private double saldo;

  public ContaBancaria(String senha) {
    this.senha = senha;
    this.saldo = 0.0;
  }

  public abstract void sacar(double valor);

  public abstract void depositar(double valor);

  public abstract void tiraExtrato();

  public boolean alterarSenha(String senha) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua senha anteior: ");
    if (scanner.nextLine().equals(senha)) {
      this.senha = senha;
      scanner.close();
      return true;
    } else {
      scanner.close();
      return false;
    }
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
