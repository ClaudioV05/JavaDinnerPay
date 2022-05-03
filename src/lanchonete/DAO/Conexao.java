package lanchonete.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost:3306/lanchonetedb";
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	// Conectar ao banco
	public static Connection abrir() throws Exception {
		// Registrar o driver
		Class.forName(DRIVER);
		// Capturar a conex�o
		Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
		// Retorna a conexao aberta
		return conn;
	}
}