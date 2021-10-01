package br.edu.unifacef;

import br.edu.unifacef.business.*;
import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.dao.EstoqueDAO;
import br.edu.unifacef.dao.FuncionarioDAO;
import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Cliente;
import br.edu.unifacef.model.Estoque;
import br.edu.unifacef.model.Funcionario;
import br.edu.unifacef.model.Produto;

public class Main {

	public static void main(String[] args) {


		System.out.println("--- Sistema de Vendas ---");
		// -----------------------------------------------------------------------------------------------------------
		//Funcionario
		//Cadastro de Funcionario
		System.out.println("------ Funcionario  ------");
		System.out.println("Cadastrar Funcionario! ");
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.setNome("Maria Rita");
		novoFuncionario.setDocumento("123.456.789-99");
		novoFuncionario.setCargo("Gerente");
		novoFuncionario.setEmail("mariarita@email.com");
		FuncionarioBusiness funcionarioBusiness = new FuncionarioBusiness(new FuncionarioDAO());
		Funcionario funcionarioSalvo =	funcionarioBusiness.salvarFuncionario(novoFuncionario);
		System.out.println("Funcionario Cadastrado: " + funcionarioSalvo +"\n");

		//Atualizar email do funcionario
		System.out.println("Atualizar email do funcionario!");
		FuncionarioBusiness atualizarEmailFuncionarios = new FuncionarioBusiness(new FuncionarioDAO());
		String atualizarEmailFuncionario = atualizarEmailFuncionarios.atualizarEmailFuncionario("123.456.789-99", "mrita@email.com");
		System.out.println("Novo email cadastrado do Funcionario: "+ atualizarEmailFuncionario + "\n");

		//Pesquisar funcionario
		System.out.println("Pesquisar Funcionario!");
		FuncionarioBusiness pesquisarFuncionarios = new FuncionarioBusiness(new FuncionarioDAO());
		String pesquisarFuncionario = pesquisarFuncionarios.pesquisarFuncionario(320L);
		System.out.println("Nome do Funcionario: "+ pesquisarFuncionario + "\n");

		//Atualizar cargo do funcionario
		System.out.println("Atualizar cargo do Funcionario!");
		FuncionarioBusiness atualizarCargoFuncionarios = new FuncionarioBusiness(new FuncionarioDAO());
		String atualizarCargoFuncionario = atualizarCargoFuncionarios.atualizarCargoFuncionario(320L, "Chefe do setor");
		System.out.println("Novo cargo do Funcionario: "+ atualizarCargoFuncionario + "\n");

		//Excluir funcionario
		System.out.println("Excluir Funcionario!");
		FuncionarioBusiness excluirFuncionarios = new FuncionarioBusiness(new FuncionarioDAO());
		Long excluirFuncionario = excluirFuncionarios.excluirFuncionario(320L);
		System.out.println("Funcionario Excluido \n");

		// -----------------------------------------------------------------------------------------------------------

		// -----------------------------------------------------------------------------------------------------------
		//Cliente
		//Cadastro de Cliente
		System.out.println("------ Cliente  ------");
		System.out.println("Cadastrar Cliente! ");
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("João Pedro");
		novoCliente.setDocumento("111.222.333-44");
		novoCliente.setNascimento("02/04/1999");
		novoCliente.setEmail("joaopedro@email.com");
		ClienteBusiness clienteBusiness = new ClienteBusiness(new ClienteDAO());
		Cliente clienteSalvo = clienteBusiness.salvarCliente(novoCliente);
		System.out.println("Cliente Cadastrado: " + clienteSalvo +"\n");

		//Atualizar email do cliente
		System.out.println("Atualizar email do cliente!");
		ClienteBusiness atualizarEmailClientes = new ClienteBusiness(new ClienteDAO());
		String atualizarEmailCliente = atualizarEmailClientes.atualizarEmailCliente("111.222.333-44", "jpdias@email.com");
		System.out.println("Novo email cadastrado do Cliente: "+ atualizarEmailCliente + "\n");

		//Pesquisar cliente
		System.out.println("Pesquisar cliente!");
		ClienteBusiness pesquisarClientes = new ClienteBusiness(new ClienteDAO());
		String pesquisarCliente = pesquisarClientes.pesquisarCliente("111.222.333-44");
		System.out.println("Nome do Cliente: "+ pesquisarCliente + "\n");

		//Atualizar nome do cliente
		System.out.println("Atualizar nome do cliente!");
		ClienteBusiness atualizarNomeClientes = new ClienteBusiness(new ClienteDAO());
		String atualizarNomeCliente = atualizarNomeClientes.atualizarNomeCliente("111.222.333-44", "João Pedro Dias");
		System.out.println("Novo nome cadastrado do Cliente: "+ atualizarNomeCliente + "\n");

		//Excluir cliente
		System.out.println("Excluir cliente!");
		ClienteBusiness excluirClientes = new ClienteBusiness(new ClienteDAO());
		Long excluirCliente = excluirClientes.excluirCliente(999L);
		System.out.println("Cliente Excluido \n");

		// -----------------------------------------------------------------------------------------------------------

		// -----------------------------------------------------------------------------------------------------------
		//Produto
		//Cadastro de Produto
		System.out.println("------ Produto  ------");
		System.out.println("Cadastrar Produto! ");
		Produto novoProduto = new Produto();
		novoProduto.setDescricao("Notebook Acer M14");
		novoProduto.setValorCompra(3500.00);
		novoProduto.setValorVenda(4999.99);
		novoProduto.setFornecedor("Acer");
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(new ProdutoDAO());
		Produto produtoSalvo = produtoBusiness.salvarProduto(novoProduto);
		System.out.println("Produto Cadastrado: " + produtoSalvo + "\n");

		//Alterar valor de venda
		System.out.println("Alterar valor!");
		ProdutoBusiness novoValor = new ProdutoBusiness(new ProdutoDAO());
		Double alterar = novoValor.alterarValorVenda(351L, 5299.99);
		System.out.println("Valor de venda do produto alterado para: " + alterar+ "\n");

		//Atualizar descrição do produto
		System.out.println("Atualizar descrição!");
		ProdutoBusiness novaDescricao = new ProdutoBusiness(new ProdutoDAO());
		String descrever = novaDescricao.atualizarDescricaoProduto(351L, "Notebook Positivo M14-S");
		System.out.println("Descrição do produto alterada para: " + descrever+ "\n");

		//Atualizar fornecedor do produto
		System.out.println("Atualizar fornecedor!");
		ProdutoBusiness novoFornecedor = new ProdutoBusiness(new ProdutoDAO());
		String fornecedor = novoFornecedor.atualizarFornecedorProduto(351L, "Positivo");
		System.out.println("Valor do produto alterado para: " + fornecedor+ "\n");

		//Excluir produto
		System.out.println("Excluir produto!");
		ProdutoBusiness excluirProdutos = new ProdutoBusiness(new ProdutoDAO());
		Long excluirProduto = excluirProdutos.excluirProduto(351L);
		System.out.println("Produto Excluido \n");

		// -----------------------------------------------------------------------------------------------------------

		// -----------------------------------------------------------------------------------------------------------
		//Estoque
		//Cadastro de Estoque
		System.out.println("------ Estoque  ------");
		System.out.println("Cadastrar Estoque! ");
		Estoque novoEstoque = new Estoque();
		novoEstoque.setIdProduto(351L);
		novoEstoque.setQuantidade(10);
		novoEstoque.setEstoqueMaximo(15);
		novoEstoque.setEstoqueMinimo(5);
		EstoqueBusiness estoqueBusiness = new EstoqueBusiness(new EstoqueDAO());
		Estoque estoqueSalvo = estoqueBusiness.salvarEstoque(novoEstoque);
		System.out.println("Estoque Cadastrado: " + estoqueSalvo+ "\n");

		//Aumentar estoque
		System.out.println("Aumentar Estoque!");
		EstoqueBusiness aumento = new EstoqueBusiness(new EstoqueDAO());
		Integer aumentar = aumento.aumentarEstoque(351L, 3);
		System.out.println("Estoque do produto aumentado para: " + aumentar+ "\n");

		//Reduzir estoque
		System.out.println("Diminuir Estoque!");
		EstoqueBusiness reducao = new EstoqueBusiness(new EstoqueDAO());
		Integer diminuir = reducao.diminuirEstoque(351L, 5);
		System.out.println("Estoque do produto reduzido para: " + diminuir+ "\n");

		//Pesquisar estoque
		System.out.println("Pesquisar Estoque!");
		EstoqueBusiness pesquisar = new EstoqueBusiness(new EstoqueDAO());
		Integer pesquisa = pesquisar.pesquisarEstoque(351L);
		System.out.println("O estoque do produto é: " + pesquisa + "\n");

		//Zerar estoque
		System.out.println("Zerar Estoque!");
		EstoqueBusiness zerar = new EstoqueBusiness(new EstoqueDAO());
		Integer zerarEstoque = zerar.zerarEstoque(351L);
		System.out.println("O estoque do produto foi zerado!\n");
		// -----------------------------------------------------------------------------------------------------------
		System.out.println("--- FIM ---");

	}

}
