import java.text.DecimalFormat;

public class TesteMath {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		
		double valor1 = 9.46;
		String resultado = df.format(valor1 + 10);
		
		System.out.println(resultado);
	}

}
