package br.com.tadeu.cadastro_de_clientes_jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:mysql://127.0.0.1:3306/cadastroclientescomjbdc?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String senha = "f92614981";
	
	
	public Connection recuperaConexao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, senha);
		return connection;
	}
}
