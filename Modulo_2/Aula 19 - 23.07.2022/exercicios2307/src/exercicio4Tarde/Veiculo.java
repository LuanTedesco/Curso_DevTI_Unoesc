package exercicio4Tarde;

public class Veiculo {

  int ano;
  String modelo;
  String cor;
  double quilometragem;

  public Veiculo(int ano, String modelo, String cor, double quilometragem) {
    this.ano = ano;
    this.modelo = modelo;
    this.cor = cor;
    this.quilometragem = quilometragem;
  }
  
  

  public int getAno() {
	return ano;
}



public void setAno(int ano) {
	this.ano = ano;
}



public String getModelo() {
	return modelo;
}



public void setModelo(String modelo) {
	this.modelo = modelo;
}



public String getCor() {
	return cor;
}



public void setCor(String cor) {
	this.cor = cor;
}



public double getQuilometragem() {
	return quilometragem;
}



public void setQuilometragem(double quilometragem) {
	this.quilometragem = quilometragem;
}



String verificarManutencao() {
    if (quilometragem <= 25.000) {
      return "Tudo OK";
    } else if (quilometragem > 25.000 && quilometragem <= 75.000) {
      return "Realizar revisão parcial";
    } else {
      return "Realizar revisão completa";
    }
  }

  void mudarCor(String cor) {
    this.cor = cor;
  }

  String exibirCor() {
    return this.cor;
  }
}
