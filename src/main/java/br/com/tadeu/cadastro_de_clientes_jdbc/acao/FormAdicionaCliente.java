package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormAdicionaCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException {
		
		return "forward:formAdicionaCliente.jsp";
	}

}
