package list.OperacoesBasicas;

public class Item {
  private String nome;
  private double preco;
  private int quantidade;

  // constructor
  public Item(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  // getter method
  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  // to string method
  @Override
  public String toString() {
    return nome;
  }
}
