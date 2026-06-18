package Curso2;

public class Titulo {
    String nome;
    int anoDeLançamento;
    int duracao;

    public Titulo(String nome, int anoDeLançamento, int duracao) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
