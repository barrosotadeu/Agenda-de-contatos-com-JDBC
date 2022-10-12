package br.com.tadeu.cadastro_de_clientes_jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente;

public class ClienteDAO {
	
	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastraCliente(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO CLIENTES(nome, cpf, telefone) VALUES(?, ?, ?)";
		try(PreparedStatement pstm = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCPF());
			pstm.setString(3, cliente.getTelefone());
			
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					cliente.setId(rst.getInt(1));
				}
			}
			
		}
	}
	
	public List<Cliente> listarClientes() throws SQLException{
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "SELECT * FROM CLIENTES";
		try(PreparedStatement pstm = this.connection.prepareStatement(sql)){
			pstm.execute();
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Cliente cliente = 
							new Cliente(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
					clientes.add(cliente);
				}
			}
		}
		return clientes;
				
	}
	
	public void deletaClienta(Integer id) throws SQLException {
		
		String sql = "DELETE FROM CLIENTES WHERE id = ?";
		try(PreparedStatement pstm = this.connection.prepareStatement(sql)){
			pstm.setInt(1, id);
			pstm.execute();
		}
	}
	
	public Cliente selecionaPeloId(Integer id) throws SQLException {
		Cliente cliente = new Cliente();
		String sql = "SELECT * FROM CLIENTES WHERE id = ?";
		try(PreparedStatement pstm = this.connection.prepareStatement(sql)){
			pstm.setInt(1, id);
			pstm.execute();
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					cliente.setId(rst.getInt(1));
					cliente.setNome(rst.getString(2));
					cliente.setCPF(rst.getString(3));
					cliente.setTelefone(rst.getString(4));
				}
			}
		}
		return cliente;
	}
	
	public void alteraCliente(Cliente cliente) throws SQLException{
		String sql = "UPDATE CLIENTES SET NOME = ?, cpf = ?, telefone = ? WHERE ID = ?";
		try(PreparedStatement pstm = this.connection.prepareStatement(sql)){
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCPF());
			pstm.setString(3, cliente.getTelefone());
			pstm.setInt(4, cliente.getId());
			pstm.execute();
			
			
		}
	}
	
	

}
