package biz.r2s.security.model;

public class LogAcesso extends Log {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3408941330775185812L;

	public LogAcesso(){
		this.setTipoLog(TipoLog.ACESSO.getIdentificador());
	}
	
	private Sessao sessao;

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

}
