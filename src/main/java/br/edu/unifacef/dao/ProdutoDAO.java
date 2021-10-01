package br.edu.unifacef.dao;

import br.edu.unifacef.model.Produto;

public class ProdutoDAO {

    public Produto salvar(final Produto produto) {

        produto.setId(351L);

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(insert into cliente (
         */

        //TODO: chamar função salvar bd

        return produto;
    }

    public Double alterarValorVenda(final Long idProduto, Double novoValor){

        Double valor = novoValor;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_produto set valor_venda='valor' where idProduto = 'idProduto')
         */
        return  valor;

    }

    public String atualizarDescricaoProduto(final Long idProduto, String descricao){

        String novaDescricao = descricao;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_produto set descricao='novaDescricao' where idProduto = 'idProduto')
         */
        return  novaDescricao;

    }

    public String atualizarFornecedorProduto(final Long idProduto, String fornecedor){

        String novoFornecedor = fornecedor;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_produto set fornecedor='novoFornecedor' where idProduto = 'idProduto')
         */
        return  novoFornecedor;

    }

    public Long excluirProduto(final Long idProduto){

        Long id = idProduto;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(delete from tb_produto where idProduto = 'id')
         */
        return  id;

    }
}
