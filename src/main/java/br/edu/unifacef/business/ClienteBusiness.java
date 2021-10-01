package br.edu.unifacef.business;

import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.model.Cliente;

public class ClienteBusiness {

	private ClienteDAO clienteDAO;
	
	public ClienteBusiness(ClienteDAO dao) {
		this.clienteDAO = dao;
	}
	
	public Cliente salvarCliente(Cliente cliente) {
		
		if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
			throw new RuntimeException("Nome do cliente requerido");
		}

		if(cliente.getDocumento() == null || cliente.getDocumento().isEmpty()) {
			throw new RuntimeException("Documento do cliente requerido");
		}

		if(cliente.getEmail() == null || cliente.getEmail().isEmpty()) {
			throw new RuntimeException("Email do cliente requerido");
		}

		if(cliente.getNascimento() == null || cliente.getNascimento().isEmpty()) {
			throw new RuntimeException("Nascimento do cliente requerido");
		}
		
		return this.clienteDAO.salvar(cliente);		
		
	}

	public String atualizarEmailCliente(String documento, String novoEmail) {

		if(documento == null) {
			throw new RuntimeException("Documento do Cliente requerido");
		}
		if(novoEmail == null || novoEmail.isEmpty()) {
			throw new RuntimeException("Novo email do cliente requerido");
		}

		return this.clienteDAO.atualizarEmailCliente(documento, novoEmail);
	}

	public String pesquisarCliente(String documento) {

		if(documento == null) {
			throw new RuntimeException("Documento do Cliente requerido");
		}

		return this.clienteDAO.pesquisarCliente(documento);
	}

	public String atualizarNomeCliente(String documento, String novoNome) {

		if(documento == null) {
			throw new RuntimeException("Documento do Cliente requerido");
		}
		if(novoNome == null || novoNome.isEmpty()) {
			throw new RuntimeException("Novo nome do cliente requerido");
		}

		return this.clienteDAO.atualizarNomeCliente(documento, novoNome);
	}


	public Long excluirCliente(Long idCliente) {

		if(idCliente == null) {
			throw new RuntimeException("ID do Cliente requerido");
		}

		return this.clienteDAO.excluirCliente(idCliente);
	}
}
