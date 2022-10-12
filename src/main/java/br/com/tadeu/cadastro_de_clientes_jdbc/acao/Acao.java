package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, ServletException;

}
