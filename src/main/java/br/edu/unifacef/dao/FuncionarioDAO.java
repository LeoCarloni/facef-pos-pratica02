package br.edu.unifacef.dao;

import br.edu.unifacef.model.Funcionario;

public class FuncionarioDAO {

    public Funcionario salvar(final Funcionario funcionario) {

        funcionario.setId(320L);

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(insert into cliente (
         */

        //TODO: chamar função salvar bd

        return funcionario;
    }

    public String atualizarEmailFuncionario(final String documento, String novoEmail){

        String email = novoEmail;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_funcionarios set email='novoEmail' where documento = 'documento')
         */
        return email;

    }

    public String pesquisarFuncionario(final Long idFuncionario){

        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(select nome_funcionario from tb_funcionarios where id = 'idFuncionario')
         */
        //Resultado do select na variavel nomeFuncionario
        String nomeFuncionario = "Maria Rita";
        return nomeFuncionario;

    }

    public String atualizarCargoFuncionario(final Long idFuncionario, String novoCargo){

        String cargo = novoCargo;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(update tb_funcionarios set nome='novoNome' where id = 'idFuncionario')
         */
        return cargo;

    }

    public Long excluirFuncionario(final Long idFuncionario){

        Long id = idFuncionario;
        /*
         * ConexaoBD(user, senha, host)
         * conexao.statement(delete from tb_funcionarios where id_funcionario = 'idFuncionario')
         */
        return  id;

    }
}
