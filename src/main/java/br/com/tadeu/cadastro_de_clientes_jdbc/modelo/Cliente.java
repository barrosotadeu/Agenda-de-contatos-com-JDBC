package br.com.tadeu.cadastro_de_clientes_jdbc.modelo;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String CPF;
	private String telefone;
	
	public Cliente() {
		super();
		
	}
	
	public Cliente(Integer id, String nome, String cpf, String telefone) {
		this.id = id;
		this.nome = nome;
		this.CPF = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getId() {
		return id;
	}

	public String getCPF() {
		return CPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
}
