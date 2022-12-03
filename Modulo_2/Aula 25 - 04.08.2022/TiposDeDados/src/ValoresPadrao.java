public class ValoresPadrao {
	int numero;
	float valor;
	boolean estado;
	char letra;
	String nome;
	
	String nomeDoEstudante;
	
	public static void main(String[] args) {
		ValoresPadrao vp = new ValoresPadrao();
		
		System.out.println("int....: " + vp.numero);
		System.out.println("float..: " + vp.valor);
		System.out.println("boolean: " + vp.estado);
		System.out.println("char...: " + vp.letra);
		System.out.println("String.: " + vp.nome);
		
		vp.teste();
	}
	
	public void teste() {
		String s = "teste";
		int numero = 10;
		
		System.out.println(s);
		System.out.println(numero);
	}
}
