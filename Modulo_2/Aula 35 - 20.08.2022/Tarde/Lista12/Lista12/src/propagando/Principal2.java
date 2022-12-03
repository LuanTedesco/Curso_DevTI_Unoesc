package propagando;

public class Principal2 {
	public static void main(String[] args) {
		Calculadora2 calc = new Calculadora2();
		
		try {
			System.out.println(calc.dividir(10, 0));
		} catch (ErroDivisaoPorZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("Divisão " + e.getNumerador() + " / 0 falhou");
		}
	}
}
