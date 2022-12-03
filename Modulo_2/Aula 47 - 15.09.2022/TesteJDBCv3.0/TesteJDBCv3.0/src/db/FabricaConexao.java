package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
//	private static ComboPooledDataSource cpds = new ComboPooledDataSource();
//	
//	static {
//		try {
//			Properties prop = loadProperties();
//			
//			cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
//            cpds.setJdbcUrl(prop.getProperty("url"));
//            cpds.setUser(prop.getProperty("usuario"));
//            cpds.setPassword(prop.getProperty("senha"));
//            
//            cpds.setMinPoolSize(3);
//            cpds.setAcquireIncrement(3);
//            cpds.setMaxPoolSize(5);			// Número máximo de conexões
//		} catch (IOException | PropertyVetoException e) {
//			// Converte exceção checada em uma não checada
//			throw new DbException(e.getMessage());
//		}
//	}

	private static Connection conexao = null;
	
	public static Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
			
			Properties prop = loadProperties();

			final String url = prop.getProperty("url");
			final String usuario = prop.getProperty("usuario");
			final String senha = prop.getProperty("senha");
			
			conexao = DriverManager.getConnection(url, usuario, senha);
			
			return conexao;
		} catch (SQLException | IOException e) {
			// Converte exceção checada em uma não checada
			throw new DbException(e.getMessage());
		}
	}
	
	private FabricaConexao() { }
	
//	public static Connection getConexao() {
//		try {
//			return cpds.getConnection();
//		} catch (SQLException e) {
//			throw new DbException(e.getMessage());
//		}
//	}
	
	public static void fechaConexao() {
		if (conexao != null) {
			try {
				conexao.close();
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
