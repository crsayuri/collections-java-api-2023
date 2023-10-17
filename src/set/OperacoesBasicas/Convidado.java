package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof Convidado convidado))
      return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  @Override
  public String toString() {
    return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
  }

}
