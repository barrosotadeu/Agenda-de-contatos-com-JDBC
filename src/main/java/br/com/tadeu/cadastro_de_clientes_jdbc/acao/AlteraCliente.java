package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ClienteDAO;
import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ConnectionFactory;
import br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente;

public class AlteraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException {
		
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		ClienteDAO dao = new ClienteDAO(new ConnectionFactory().recuperaConexao());
		
		Cliente cliente = dao.selecionaPeloId(id);
		cliente.setNome(request.getParameter("nome"));
		cliente.setCPF(request.getParameter("cpf"));
		cliente.setTelefone(request.getParameter("telefone"));
		
		dao.alteraCliente(cliente);
		
		return "redirect:entrada?acao=ListaClientes";
	}

}
