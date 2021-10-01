package br.edu.unifacef.model;

public class Produto {

    private Long id;

    private String descricao;

    private Double valorCompra;

    private Double valorVenda;

    private String fornecedor;

    @Override
    public String toString() {
        return "Produto [ID= " + id + ", Descrição= " + descricao + ", Valor de compra= " + valorCompra
                + ", Valor de venda=" + valorVenda + ", Fornecedor= " + fornecedor + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getFornecedor () { return fornecedor; }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
