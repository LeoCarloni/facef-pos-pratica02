package br.edu.unifacef.model;

public class Estoque {

    private Long id;

    private Long idProduto;

    private Integer quantidade;

    private Integer estoqueMinimo;

    private Integer estoqueMaximo;

    @Override
    public String toString() {
        return "Estoque [ID=" + id + ", ID do Produto=" + idProduto + ", Quantidade em estoque=" + quantidade
                + ", Estoque Minimo=" + estoqueMinimo + ", Estoque Maximo=" + estoqueMaximo + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) { this.idProduto = idProduto; }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) { this.estoqueMaximo = estoqueMaximo; }
}
