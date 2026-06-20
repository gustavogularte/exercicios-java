package Curso1;

public class CarrinhoDeCompras {
    String nome;
    double preco;
    int quantidade;

    CarrinhoDeCompras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return preco * quantidade;
    }
}
