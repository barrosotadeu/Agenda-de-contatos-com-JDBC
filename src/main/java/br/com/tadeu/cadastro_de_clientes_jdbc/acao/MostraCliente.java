package br.com.tadeu.cadastro_de_clientes_jdbc.acao;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ClienteDAO;
import br.com.tadeu.cadastro_de_clientes_jdbc.controller.ConnectionFactory;
import br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente;

public class MostraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		ClienteDAO dao = new ClienteDAO(new ConnectionFactory().recuperaConexao());
		Cliente cliente = dao.selecionaPeloId(id);
		
		request.setAttribute("cliente", cliente);
		
		
		
		return "forward:formAlteraCliente.jsp";
	}

}
