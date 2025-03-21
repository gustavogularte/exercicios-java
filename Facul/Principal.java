import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantas contas criar: ");
    int totalContas = scanner.nextInt();

    ContaBancaria[] contas = new ContaBancaria[totalContas];

    for (int i = 0; i < totalContas; i++) {
      System.out.println(i + 1 + " conta será: [1] Conta corrente \n[2] Conta poupança");
      int tipoConta = scanner.nextInt();

      if (tipoConta == 1) {
        ContaBancaria contaCorrente = new ContaCorrente("123456");
        contas[i] = contaCorrente;
      } else if (tipoConta == 2) {
        ContaBancaria contaPoupanca = new ContaPoupanca("123456");
        contas[i] = contaPoupanca;
      }
    }

    for (ContaBancaria conta : contas) {
      conta.depositar(Math.random() * 500);
      conta.sacar(Math.random() * 500);
      if (conta instanceof ContaCorrente) {
        System.out.println("Quantidade de transações: " + ((ContaCorrente) conta).getQuantidadeTransacoes());
      }
      if (conta instanceof ContaPoupanca) {
        System.out.printf("Taxa de rendimento: " + ((ContaPoupanca) conta).getTaxaRendimento());
        System.out.println(" Saldo na conta: " + conta.getSaldo() + " Rentimento: " + ((ContaPoupanca) conta).calculaRendimento());
      }
    }
  }
}
