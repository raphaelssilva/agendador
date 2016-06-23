package biz.r2s.util.model;

public class PessoaJuridica extends Pessoa{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1135244115308347097L;
	
	private int cnpj;	 
	private int razaoSocial;
	private int inscricaoEstatual;
	private int inscricaoMunicipal;
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(int razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getInscricaoEstatual() {
		return inscricaoEstatual;
	}
	public void setInscricaoEstatual(int inscricaoEstatual) {
		this.inscricaoEstatual = inscricaoEstatual;
	}
	public int getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(int inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}	
}
 
