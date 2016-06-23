package biz.r2s.util.model;

import java.io.Serializable;
public class Telefone implements Serializable, MongoDBModel{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -1537785179386252097L;
	private String id;
	private Long numero;
	private String descricao;
	private Integer ddd;
	private Integer ramal;
	private Integer codPais;
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getRamal() {
		return ramal;
	}
	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	public Integer getCodPais() {
		return codPais;
	}
	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
 
