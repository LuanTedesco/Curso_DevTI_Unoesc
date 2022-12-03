package db;

public class DbIntegridadeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbIntegridadeException(String mensagem) {
		super(mensagem);
	}
}
