package br.edu.unifacef.business;

import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Produto;

public class ProdutoBusiness {

    private ProdutoDAO produtoDAO;

    public ProdutoBusiness(ProdutoDAO dao) {
        this.produtoDAO = dao;
    }

    public Produto salvarProduto(Produto produto) {

        if(produto.getDescricao() == null || produto.getDescricao().isEmpty()) {
            throw new RuntimeException("Descrição do produto requerido");
        }

        if(produto.getValorCompra() == null) {
            throw new RuntimeException("Valor de compra do produto requerido");
        }

        if(produto.getValorVenda() == null) {
            throw new RuntimeException("Valor de venda do produto requerido");
        }

        if(produto.getFornecedor() == null || produto.getFornecedor().isEmpty()) {
            throw new RuntimeException("Fornecedor do produto requerido");
        }

        return this.produtoDAO.salvar(produto);

    }

    public Double alterarValorVenda(Long idProduto, Double valor) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        if(valor < 1.00) {
            throw new RuntimeException("Valor invalido");
        }

        return this.produtoDAO.alterarValorVenda(idProduto, valor);
    }

    public String atualizarDescricaoProduto(Long idProduto, String descricao) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        if(descricao == null || descricao.isEmpty()) {
            throw new RuntimeException("Descrição do produto requerido");
        }

        return this.produtoDAO.atualizarDescricaoProduto(idProduto, descricao);
    }

    public String atualizarFornecedorProduto(Long idProduto, String fornecedor) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }
        if(fornecedor == null || fornecedor.isEmpty()) {
            throw new RuntimeException("Fornecedor do produto requerido");
        }

        return this.produtoDAO.atualizarFornecedorProduto(idProduto, fornecedor);
    }

    public Long excluirProduto(Long idProduto) {

        if(idProduto == null) {
            throw new RuntimeException("ID do Produto requerido");
        }

        return this.produtoDAO.excluirProduto(idProduto);
    }

}
