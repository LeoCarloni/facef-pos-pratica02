package br.edu.unifacef.model;

public class Funcionario {

    private Long id;

    private String nome;

    private String documento;

    private String email;

    private String cargo;

    @Override
    public String toString() {
        return "Funcionario [ID= " + id + ", Nome= " + nome + ", CPF= " + documento + ", Cargo= " + cargo + ", Email= " + email + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public String getCargo () { return cargo; }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
