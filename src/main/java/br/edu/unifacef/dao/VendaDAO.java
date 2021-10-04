package br.edu.unifacef.dao;

import br.edu.unifacef.model.Venda;

public class VendaDAO {

    public Venda salvar(final Venda venda) {

        venda.setId(888L);

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(insert into tb_venda (
         */

        //TODO: chamar função salvar bd

        return venda;
    }

    public Long excluirVenda(final Long idVenda){

        Long id = idVenda;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(delete from tb_vendas where idVenda = 'id')
         */
        return  id;

    }

    public Double definirDesconto(final Double valorBruto, Double porcentagem){

        Double valorSemDesconto = valorBruto;
        Double desconto = valorBruto * (porcentagem/100);
        Double valorFinal = valorSemDesconto - desconto;
        return valorFinal;
    }

    public Long pesquisarVendedor(final Long idVenda){

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(select idFuncionario from tb_vendas where id = 'idVenda')
         */
        //Resultado do select na variavel idFuncionario
        Long idFuncionario = 351L;
        return idFuncionario;

    }

    public Double pesquisarValor(final Long idVenda){

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(select valorBruto from tb_vendas where id = 'idVenda')
         */
        //Resultado do select na variavel valorBruto
        Double valorBruto = 100.00;
        return valorBruto;

    }

}