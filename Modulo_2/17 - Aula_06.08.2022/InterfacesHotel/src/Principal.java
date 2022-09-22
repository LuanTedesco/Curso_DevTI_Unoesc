import model.Gerente;
import model.Recepcionista;

public class Principal {
	public static void main(String[] args) {
		Recepcionista ana = new Recepcionista("Ana", "bla", "bla");
		ana.atender();
		ana.falarIngles();
		
		System.out.println("-------");
		
		Gerente marcia = new Gerente("Marcia", "", "");
		marcia.atender();
		marcia.falarIngles();
		marcia.arrumarACama();
		marcia.limparQuarto();
	}
}
