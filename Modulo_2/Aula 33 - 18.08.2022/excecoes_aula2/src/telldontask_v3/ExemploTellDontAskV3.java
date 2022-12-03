package telldontask_v3;

class PostJaPublicadoException extends RuntimeException {
	public PostJaPublicadoException(String mensagem) {
		super(mensagem);
	} 
}

enum PostStatus {
	RASCUNHO, PUBLICADO
}

class Post {
	private PostStatus status = PostStatus.RASCUNHO;
	
	public void publicar() {
		// Aplicando o princ�pio "fail fast"
		if (this.status != PostStatus.RASCUNHO) {
			throw new PostJaPublicadoException("Post j� publicado!");
		}
		
		this.status = PostStatus.PUBLICADO;
	}
}

public class ExemploTellDontAskV3 {
	
	public static void main(String[] args) {
		Post postagem = new Post();
		
		// Aplicando o princ�pio "tell, don't ask"
		postagem.publicar();
	}
	
}
