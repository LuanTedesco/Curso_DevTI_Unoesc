package telldontask_v2;

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
		if (this.status == PostStatus.RASCUNHO) {
			this.status = PostStatus.PUBLICADO;
		} else {
			throw new PostJaPublicadoException("Post já publicado!");
		}
	}
}

public class ExemploTellDontAskV2 {
	
	public static void main(String[] args) {
		Post postagem = new Post();
		
		// Aplicando o princípio "tell, don't ask"
		postagem.publicar();
	}
	
}
