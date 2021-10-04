package br.edu.unifacef.model;

public class Venda {

    private Long id;

    private Long idCliente;

    private Long idVendedor;

    private Double valorBruto;

    private Double valorFinal;

    @Override
    public String toString() {
        return "Venda [ID= " + id + ", Cliente= " + idCliente + ", Vendedor= " + idVendedor
                + ", Valor sem desconto=" + valorBruto + ", Valor com desconto= " + valorFinal + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) { this.idCliente = idCliente; }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) { this.idVendedor = idVendedor; }

    public Double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public Double getValorFinal () { return valorFinal; }

    public void setValorFinal(Double valorFinal) { this.valorFinal = valorFinal; }
}
