public class Wrapper {
	public static void main(String[] args) {
		Boolean estado = null;
		
		System.out.println(estado);
		
		estado = Boolean.valueOf("true");
		System.out.println(estado);
		
		// Converte para String e então para maiúsculas
		System.out.println(estado.toString().toUpperCase());
		System.out.println();
		
		//-----------
		Integer a = 1000;
		Integer b = 1000;
		
		System.out.println(a.equals(b)); // Sempre use equals()
		System.out.println(a == b);		 // Nunca use ==
	}
}
