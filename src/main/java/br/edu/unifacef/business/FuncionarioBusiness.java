package br.edu.unifacef.business;

import br.edu.unifacef.dao.FuncionarioDAO;
import br.edu.unifacef.model.Funcionario;


public class FuncionarioBusiness {

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioBusiness(FuncionarioDAO dao) {
        this.funcionarioDAO = dao;
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {

        if(funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
            throw new RuntimeException("Nome do funcionario requerido");
        }

        if(funcionario.getDocumento() == null || funcionario.getDocumento().isEmpty()) {
            throw new RuntimeException("Documento do funcionario requerido");
        }

        if(funcionario.getEmail() == null || funcionario.getEmail().isEmpty()) {
            throw new RuntimeException("Email do funcionario requerido");
        }

        if(funcionario.getCargo() == null || funcionario.getCargo().isEmpty()) {
            throw new RuntimeException("Cargo do funcionario requerido");
        }

        return this.funcionarioDAO.salvar(funcionario);

    }

    public String atualizarEmailFuncionario(String documento, String novoEmail) {

        if(documento == null) {
            throw new RuntimeException("Documento do Funcionario requerido");
        }
        if(novoEmail == null || novoEmail.isEmpty()) {
            throw new RuntimeException("Novo email do funcionario requerido");
        }

        return this.funcionarioDAO.atualizarEmailFuncionario(documento, novoEmail);
    }

    public String pesquisarFuncionario(Long idFuncionario) {

        if(idFuncionario == null) {
            throw new RuntimeException("ID do Funcionario requerido");
        }

        return this.funcionarioDAO.pesquisarFuncionario(idFuncionario);
    }

    public String atualizarCargoFuncionario(Long idFuncionario, String novoCargo) {

        if(idFuncionario == null) {
            throw new RuntimeException("ID do Funcionario requerido");
        }
        if(novoCargo == null || novoCargo.isEmpty()) {
            throw new RuntimeException("Novo cargo do funcionario requerido");
        }

        return this.funcionarioDAO.atualizarCargoFuncionario(idFuncionario, novoCargo);
    }


    public Long excluirFuncionario(Long idFuncionario) {

        if(idFuncionario == null) {
            throw new RuntimeException("ID do Funcionario requerido");
        }

        return this.funcionarioDAO.excluirFuncionario(idFuncionario);
    }
}
