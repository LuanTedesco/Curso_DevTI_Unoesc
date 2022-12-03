package telldontask_v1;

class PostJaPublicadoException extends RuntimeException {
	public PostJaPublicadoException(String mensagem) {
		super(mensagem);
	} 
}

enum PostStatus {
	RASCUNHO, PUBLICADO
}

class Post {
	public PostStatus status = PostStatus.RASCUNHO;
}

public class ExemploTellDontAskV1 {
	
	public static void main(String[] args) {
		Post postagem = new Post();
		
		if (postagem.status == PostStatus.RASCUNHO) {
			postagem.status = PostStatus.PUBLICADO;
		} else {
			throw new PostJaPublicadoException("Post já publicado!");
		}
	}
	
}
