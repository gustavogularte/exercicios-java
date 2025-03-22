import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estoque {
  private List<Produto> produtos = new ArrayList<>();

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public void preencher(String arquivo) {
    try {
      FileReader fr = new FileReader(arquivo);
      BufferedReader br = new BufferedReader(fr);

      br.readLine();
      String produto = br.readLine();

      while (produto != null) {
        String[] produtoInfo = produto.split("\\s\\*\\s");
        produto = br.readLine();
        String nome = produtoInfo[0];
        String descricao = produtoInfo[1];
        double preco = Double.parseDouble(produtoInfo[2]);
        String tipo = produtoInfo[3];
        if (Objects.equals(tipo, "Alimento")) {
          String validade = produtoInfo[4];
          Produto alimento = new Alimento(nome, descricao, preco, validade);
          produtos.add(alimento);
        } else if (Objects.equals(tipo, "Vestuario")) {
          String estoque = produtoInfo[4];
          Produto vestuario = new Alimento(nome, descricao, preco, estoque);
          produtos.add(vestuario);
        } else if (Objects.equals(tipo, "Eletrodomestico")) {
          String ipi = produtoInfo[4];
          Produto eletrodomestico = new Alimento(nome, descricao, preco, ipi);
          produtos.add(eletrodomestico);
        }
      }
      br.close();
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado.");
    } catch (IOException e) {
      System.out.println("Erro ao ler o arquivo");
    }
  }

  public int totalEstoque(String arquivo) {
    int total = 0;
    try {
      FileReader fr = new FileReader(arquivo);
      BufferedReader br = new BufferedReader(fr);
      String linha = br.readLine();
      while (linha != null) {
        total += 1;
        linha = br.readLine();
      }
      br.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println("SLA");
    }
    return total;
  }

  @Override
  public String toString() {
    return "produto: " + this.produtos.get(2);
  }
}
