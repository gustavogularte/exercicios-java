import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private HashMap<String, Double> compras = new HashMap<>();

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public HashMap<String, Double> getCompras() {
        return compras;
    }

    public void setCompras(String descricao, double valor) {
        this.compras.put(descricao, valor);
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void comprar(String descricao, double valor) {
        if (this.getLimite() >= valor) {
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
            this.setCompras(descricao, valor);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        for (var compra : compras.entrySet()) {
            resultado += String.format("%s - R$ %.2f%n",
                    compra.getKey(),
                    compra.getValue());
        }

        resultado += String.format("%nSaldo do cartão: R$ %.2f", saldo);

        return resultado;
    }
}
