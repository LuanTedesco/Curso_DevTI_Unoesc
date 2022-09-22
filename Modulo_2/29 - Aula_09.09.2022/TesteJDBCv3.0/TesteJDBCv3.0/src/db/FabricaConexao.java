package db;
import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class FabricaConexao {
	private static ComboPooledDataSource cpds = new ComboPooledDataSource();
	
	static {
		try {
			Properties prop = loadProperties();
			
			cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl(prop.getProperty("url"));
            cpds.setUser(prop.getProperty("usuario"));
            cpds.setPassword(prop.getProperty("senha"));
            
            cpds.setMinPoolSize(3);
            cpds.setAcquireIncrement(3);
            cpds.setMaxPoolSize(5);			// Número máximo de conexões
		} catch (IOException | PropertyVetoException e) {
			// Converte exceção checada em uma não checada
			throw new DbException(e.getMessage());
		}
	}
	
	private FabricaConexao() { }
	
	public static Connection getConexao() {
		try {
			return cpds.getConnection();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
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
