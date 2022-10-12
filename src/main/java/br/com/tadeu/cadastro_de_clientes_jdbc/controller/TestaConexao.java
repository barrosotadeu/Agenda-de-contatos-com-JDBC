package br.com.tadeu.cadastro_de_clientes_jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection con = new ConnectionFactory().recuperaConexao();
		con.close();
	}
}
