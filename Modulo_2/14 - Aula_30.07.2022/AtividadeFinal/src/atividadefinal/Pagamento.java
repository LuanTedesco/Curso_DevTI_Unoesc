package atividadefinal;

public class Pagamento {

  private int tipoPagamento;

  /**
   * @return int return the tipoPagamento
   */
  public int getTipoPagamento() {
    return tipoPagamento;
  }

  /**
   * @param tipoPagamento the tipoPagamento to set
   */
  public void setTipoPagamento(int tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public void selecionarTipoPagamento(int pag) {
    tipoPagamento = pag;
  }

  public void realizarPagamento(Pagamento pagamento) {
    String metodoP;

    if (tipoPagamento == 1) {
      metodoP = "Dinheiro";
    } else if (tipoPagamento == 2) {
      metodoP = "Cheque";
    } else if (tipoPagamento == 3) {
      metodoP = "Cartão";
    } else {
      metodoP = "Inválido";
    }
    System.out.println("O pagamento foi realizado com sucesso!!");
    System.out.println("Metodo do pagamento: " + metodoP);
  }
}
