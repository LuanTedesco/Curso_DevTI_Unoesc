package db;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	private static Connection conexao = null;
	
	private FabricaConexao() { }
	
	public static Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
			
			Properties prop = loadProperties();

			final String url = prop.getProperty("url");
			final String usuario = prop.getProperty("usuario");
			final String senha = prop.getProperty("senha");
			
//			System.out.println("Conectando ao banco de dados...");
			conexao = DriverManager.getConnection(url, usuario, senha);
//			System.out.println("Conexão realizada com sucesso!");
			
			return conexao;
		} catch (SQLException | IOException e) {
			// Converte exceção checada em uma não checada
			throw new DbException(e.getMessage());
		}
	}
	
	public static void fechaConexao() {
		if (conexao != null) {
			try {
//				System.out.println("Fechando conexão...");
				conexao.close();
//				System.out.println("Conexão fechada com sucesso!");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	private static Properties loadProperties() throws FileNotFoundException, IOException {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties prop = new Properties();
			prop.load(fs);
			return prop;
		}
	}
}
