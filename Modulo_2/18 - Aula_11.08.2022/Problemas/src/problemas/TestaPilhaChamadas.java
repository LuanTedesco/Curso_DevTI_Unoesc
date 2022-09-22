package problemas;

public class TestaPilhaChamadas {
	public static void main(String[] args) {
		System.out.println("** inicio do metodo main **");
		metodo1();
		System.out.println("** fim do metodo main **");
	}
	
	private static void metodo1() {
		System.out.println("\t** inicio metodo1()***");
		metodo2();
		System.out.println("\t** fim do metodo metodo1()");
	}
	
	private static void metodo2() {
		System.out.println("\t\t** inicio metodo2()***");
		metodo3();
		System.out.println("\t\t** fim do metodo metodo2()");
	}
	
	private static void metodo3() {
		System.out.println("\t\t\t** inicio metodo3()***");
		
		try {
			Double.parseDouble("10,5");		
		} catch (NumberFormatException e) {
			System.out.println("Problema detectado!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("\t\t\t** fim do metodo metodo3()");
	}
}
