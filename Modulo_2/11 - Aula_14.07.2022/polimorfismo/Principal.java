package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		AssinaturaMetodo am = new AssinaturaMetodo();		
		AssinaturaMetodo am2 = new AssinaturaMetodo("Exemplo");
		
		//POLIMORFISMO DE SOBRECARGA
		//Realiza as altera��es nos par�metros
		//Os m�todos podem coexistir
		//Pode implementar diversos m�todos na mesma classe
		am.calcular(10, 20);
		am.calcular(10.1, 20);
		am.calcular(10);
		am.calcular();
		am.calcular(10, 20, "A", "B");
		
		am.salario = 2000;
		am.calcularSalario();
		am.calcularSalario(500);
	}
}
