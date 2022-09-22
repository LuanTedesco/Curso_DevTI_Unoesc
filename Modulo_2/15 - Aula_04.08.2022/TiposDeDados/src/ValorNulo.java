public class ValorNulo {
	public String nome;
	
	public static void main(String[] args) {
		ValorNulo vn = new ValorNulo();
		
		if (vn.nome == null) {
			vn.nome = "Fulano";
		}
		System.out.println(vn.nome.concat(", olá!"));			
	}
}
