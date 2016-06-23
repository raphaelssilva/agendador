package biz.r2s.util.model;
public class PessoaFisica extends Pessoa {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long cpf;
	private String rg;
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}	
}
 
