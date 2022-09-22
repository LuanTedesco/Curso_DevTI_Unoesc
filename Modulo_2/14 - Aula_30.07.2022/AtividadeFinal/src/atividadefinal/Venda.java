package atividadefinal;

import java.util.ArrayList;

public class Venda {

  private double vlrTotal;
  private ArrayList<Produto> listavenda = new ArrayList<Produto>();

  public Venda() {}

  /**
   * @return double return the vlrTotal
   */
  public double getVlrTotal() {
    return vlrTotal;
  }

  /**
   * @param vlrTotal the vlrTotal to set
   */
  public void setVlrTotal(double vlrTotal) {
    this.vlrTotal = vlrTotal;
  }

  /**
   * @return ArrayList<String> return the listavenda
   */
  public ArrayList<Produto> getListavenda() {
    return listavenda;
  }

  /**
   * @param listavenda the listavenda to set
   */
  public void setListavenda(ArrayList<Produto> listavenda) {
    this.listavenda = listavenda;
  }

  public void adicionarItemVenda(Produto prod) {
    listavenda.add(prod);
    vlrTotal = vlrTotal + prod.getPreco();
    prod.setQuantidadeEstoque(prod.getQuantidadeEstoque() - 1);
  }

  public void visualizarVenda() {
    for (int i = 0; i < listavenda.size(); i++) {
      System.out.printf("Posição %d - %s\n", i, listavenda.get(i));
    }
  }

  public void concluirVenda(Pagamento pagamento) {
    System.out.println("O valor total é R$ " + vlrTotal);
    pagamento.realizarPagamento(pagamento);
    listavenda.clear();
  }
}
