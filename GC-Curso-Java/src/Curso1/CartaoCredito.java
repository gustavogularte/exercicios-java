package Curso1;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public List<Compra> getCompras() {
        return compras;
    }

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
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

    public boolean comprar(Compra compra) {
        if (compra.getValor() <= saldo) {
            double novoSaldo = this.getSaldo() - compra.getValor();
            this.setSaldo(novoSaldo);
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }
}
