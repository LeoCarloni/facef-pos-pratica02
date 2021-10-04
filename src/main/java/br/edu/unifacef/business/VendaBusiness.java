package br.edu.unifacef.business;

import br.edu.unifacef.dao.VendaDAO;
import br.edu.unifacef.model.Venda;

public class VendaBusiness {

    private VendaDAO vendaDAO;

    public VendaBusiness(VendaDAO dao) {
        this.vendaDAO = dao;
    }

    public Venda salvarVenda(Venda venda) {

        if (venda.getIdVendedor() == null) {
            throw new RuntimeException("ID do vendedor requerido");
        }

        if (venda.getIdCliente() == null) {
            throw new RuntimeException("ID do cliente requerido");
        }

        if (venda.getValorBruto() == null) {
            throw new RuntimeException("Valor sem desconto requerido");
        }

        if (venda.getValorFinal() == null) {
            throw new RuntimeException("Valor com desconto requerido");
        }

        return this.vendaDAO.salvar(venda);

    }

    public Long excluirVenda(Long idVenda) {

        if(idVenda == null) {
            throw new RuntimeException("ID da venda requerido");
        }

        return this.vendaDAO.excluirVenda(idVenda);
    }

    public Double definirDesconto(Double valorBrunto, Double porcentagem) {

        if(valorBrunto == null) {
            throw new RuntimeException("Valor da venda requerido");
        }
        if(porcentagem == null) {
            throw new RuntimeException("Porcentagem de desconto requerido");
        }

        return this.vendaDAO.definirDesconto(valorBrunto, porcentagem);
    }

    public Long pesquisarVendedor(Long idVenda) {

        if(idVenda == null) {
            throw new RuntimeException("ID da venda requerido");
        }

        return this.vendaDAO.pesquisarVendedor(idVenda);
    }

    public Double pesquisarValor(Long idVenda) {

        if(idVenda == null) {
            throw new RuntimeException("ID da venda requerido");
        }

        return this.vendaDAO.pesquisarValor(idVenda);
    }

}