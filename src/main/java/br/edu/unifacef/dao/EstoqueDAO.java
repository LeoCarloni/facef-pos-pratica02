package br.edu.unifacef.dao;

import br.edu.unifacef.model.Estoque;

public class EstoqueDAO {

    public Estoque salvar(final Estoque estoque) {

        estoque.setId(5380L);

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(insert into tb_estoque (
         */

        //TODO: chamar função salvar bd

        return estoque;
    }

    public Integer aumentarEstoque(final Long idProduto, Integer novoValor){

        //select quantidade from tb_estoque where id = 'idProduto'
        //resultado do select entra no lugar do 10 abaixo
        Integer aumento = 10 + novoValor;
        return  aumento;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_estoque set quantidade='reducao' where id = 'idProduto')
         */
    }

    public Integer diminuirEstoque(final Long idProduto, Integer novoValor){

        //select quantidade from tb_estoque where id = 'idProduto'
        //resultado do select entra no lugar do 13 abaixo
        Integer reducao = 13 - novoValor;

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_estoque set quantidade='reducao' where id = 'idProduto')
         */

        return  reducao;

    }

    public Integer pesquisarEstoque(final Long idProduto){

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(select quantidade from tb_estoque where id = 'idProduto')
         */
        Integer estoque = 8;
        return  estoque;

    }

    public Integer zerarEstoque(final Long idProduto){

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_estoque set quantidade=0 where idProduto = 'idProduto')
         */
        Integer reducao = 0;
        return  reducao;

    }

}
