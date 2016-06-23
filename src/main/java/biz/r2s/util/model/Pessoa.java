package biz.r2s.util.model;

import java.io.Serializable;

public class Pessoa implements Serializable, MongoDBModel{

	private static final long serialVersionUID = 3039288063578312662L;
	
	private String id;	
	private String nome;	
	private String email;	 
	private String sobrenome;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(final String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
 
