public class Livro implements Calculavel{
    private String titulo;
    private String autor;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
