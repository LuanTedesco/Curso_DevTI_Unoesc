package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		AssinaturaMetodo am = new AssinaturaMetodo();		
		AssinaturaMetodo am2 = new AssinaturaMetodo("Exemplo");
		
		//POLIMORFISMO DE SOBRECARGA
		//Realiza as alterações nos parâmetros
		//Os métodos podem coexistir
		//Pode implementar diversos métodos na mesma classe
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
