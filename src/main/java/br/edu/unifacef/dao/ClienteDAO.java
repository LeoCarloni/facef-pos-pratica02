package br.edu.unifacef.dao;

import br.edu.unifacef.model.Cliente;

public class ClienteDAO {

	public Cliente salvar(final Cliente cliente) {
		
		cliente.setId(999L);
		
		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(insert into cliente (
		 */
		
		//TODO: chamar função salvar bd
		
		return cliente;
	}

	public String atualizarEmailCliente(final String documento, String novoEmail){

		String email = novoEmail;
		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(update tb_clientes set email='novoEmail' where documento = 'documento')
		 */
		return email;

	}

	public String atualizarNomeCliente(final String documento, String novoNome){

		String nome = novoNome;
		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(update tb_clientes set nome='novoNome' where documento = 'documento')
		 */
		return novoNome;

	}

	public String pesquisarCliente(final String documento){

		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(select nome_cliente from tb_clientes where documento = 'documento')
		 */
		//Resultado da consulta entra na variavel 'nomeCliente'
		String nomeCliente = "João Pedro";
		return nomeCliente;

	}

	public Long excluirCliente(final Long idCliente){

		Long id = idCliente;
		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(delete from tb_clientes where id_cliente = 'id')
		 */
		return  id;

	}

}
