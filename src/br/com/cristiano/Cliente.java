package br.com.cristiano;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Cliente {

	private String nome;
	private String email;
	
	@Size(min=5, message="Nome deve ter mais que 5 caracteres")
	@NotNull(message="Nome n‹o pode ser nulo")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Email(message="Email invalido")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
