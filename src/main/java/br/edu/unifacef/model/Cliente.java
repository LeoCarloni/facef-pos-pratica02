package br.edu.unifacef.model;

public class Cliente {

	private Long id;
	
	private String nome;

	private String documento;

	private String nascimento;

	private String email;
	
	
	@Override
	public String toString() {
		return "Cliente [ID=" + id + ", Nome=" + nome + ", CPF=" + documento + ", Nascimento=" + nascimento + ", Email=" + email + "]";
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
