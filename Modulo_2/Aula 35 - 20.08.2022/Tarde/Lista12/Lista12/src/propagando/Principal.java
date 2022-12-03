package propagando;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		try {
			System.out.println(calc.dividir(10, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
