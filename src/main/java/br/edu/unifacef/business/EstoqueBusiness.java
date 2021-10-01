package br.edu.unifacef.business;

import br.edu.unifacef.dao.EstoqueDAO;
import br.edu.unifacef.model.Estoque;

public class EstoqueBusiness {
    private EstoqueDAO estoqueDAO;

    public EstoqueBusiness(EstoqueDAO dao) {
        this.estoqueDAO = dao;
    }

    public Estoque salvarEstoque(Estoque estoque) {

        if(estoque.getIdProduto() == null) {
            throw new RuntimeException("ID do Produto requerido");
        }

        if(estoque.getQuantidade() == null) {
            throw new RuntimeException("Quantidade do estoque requerido");
        }

        if(estoque.getEstoqueMinimo() == null) {
            throw new RuntimeException("Quantidade minima do estoque requerido");
        }

        if(estoque.getEstoqueMaximo() == null) {
            throw new RuntimeException("Quantidade minima do estoque requerido");
        }

        return this.estoqueDAO.salvar(estoque);

    }

    public Integer aumentarEstoque(Long idProduto, Integer valor) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        if(valor < 1) {
            throw new RuntimeException("Valor invalido");
        }

        return this.estoqueDAO.aumentarEstoque(idProduto, valor);
    }

    public Integer diminuirEstoque(Long idProduto, Integer valor) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        if(valor < 1) {
            throw new RuntimeException("Valor invalido");
        }

        return this.estoqueDAO.diminuirEstoque(idProduto, valor);
    }

    public Integer pesquisarEstoque(Long idProduto) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        return this.estoqueDAO.pesquisarEstoque(idProduto);
    }

    public Integer zerarEstoque(Long idProduto) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        return this.estoqueDAO.zerarEstoque(idProduto);
    }


}
