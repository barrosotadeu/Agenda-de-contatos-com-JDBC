package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ClienteDAO;
import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ConnectionFactory;
import br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente;

public class ListaClientes implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException {
		
		ClienteDAO dao = new ClienteDAO(new ConnectionFactory().recuperaConexao());
		List<Cliente> clientes = dao.listarClientes();
		request.setAttribute("clientes", clientes);
		
		return "forward:listaClientes.jsp";
	}
	
}
