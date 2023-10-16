// package list.OperacoesBasicas;

// import java.util.ArrayList;
// import java.util.List;

// public class CarrinhoDeCompras {
// private List<Item> itemList;

// public CarrinhoDeCompras() {
// this.itemList = new ArrayList<>();
// }

// public void adicionarItem(String nome, double preco, int quantidade) {
// itemList.add(new Item(nome, preco, quantidade));
// }

// public void removerItem(String nome) {
// List<Item> itensParaRemover = new ArrayList<>();

// for (Item item : itemList) {
// if (item.getNome().equalsIgnoreCase(nome)) {
// itensParaRemover.add(item);
// }
// }
// itemList.removeAll(itensParaRemover);
// }

// public int calcularValorTotal() {
// double valorTotal = itemList.size() * itemList.getQuantidade();
// return (int) valorTotal;
// }

// public void exibirItens() {
// System.out.println(itemList);
// }

// public static void main(String[] args) {
// CarrinhoDeCompras itemList = new CarrinhoDeCompras();

// System.out.println(itemList.calcularValorTotal());

// itemList.adicionarItem("banana", 1.59, 5);
// itemList.adicionarItem("maçã", 2.59, 2);

// System.out.println("O numero total de elementos é " +
// itemList.calcularValorTotal());
// }
// }
