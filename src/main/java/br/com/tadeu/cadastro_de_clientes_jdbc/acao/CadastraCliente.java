package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente;
import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ClienteDAO;
import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ConnectionFactory;

public class CadastraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException {
		Cliente cliente = new Cliente();
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String telefone = request.getParameter("telefone");
		
		cliente.setNome(nome);
		cliente.setCPF(cpf);
		cliente.setTelefone(telefone);
		
		Connection con;
		try {
			con = new ConnectionFactory().recuperaConexao();
		} catch (ClassNotFoundException e) {
			throw new ServletException(e);
		} catch (SQLException e) {
			throw new ServletException(e);
		}
		ClienteDAO clienteDAO = new ClienteDAO(con);
		clienteDAO.cadastraCliente(cliente);
		
		return "redirect:entrada?acao=ListaClientes";
		
	}
	
}
