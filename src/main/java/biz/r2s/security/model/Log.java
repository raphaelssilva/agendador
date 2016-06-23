package biz.r2s.security.model;

import java.io.Serializable;

import java.util.Date;

import biz.r2s.util.model.MongoDBModel;

public class Log implements Serializable,MongoDBModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5303175611832559861L;
	
	private String id;
	
	private Date data;
	
	private Long nivel;
	
	private int prioridade;
	
	private String mensagem;
	
	private Long tipoLog;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getNivel() {
		return nivel;
	}
	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}
	public Long getTipoLog() {
		return tipoLog;
	}
	public void setTipoLog(Long tipoLog) {
		this.tipoLog = tipoLog;
	}	
	
	public enum TipoLog{
		EVENTO(0L),
		ACESSO(1L),
		AGENDAMENTO(2L);
		
		public Long id;
		TipoLog(Long id){
			this.id = id;
		}
		
		public Long getIdentificador(){
			return id;
		}
		
		public TipoLog getByIdentificador(Long identificador){
			return identificador<=TipoLog.values().length? TipoLog.values()[identificador.intValue()]:null;
		}
	}
	
	public enum Nivel{
		WARN(0L),
		TRACE(1L),
		OFF(2L),
		INFO(3L),
		FATAL(4L),
		ERROR(5L),
		DEBUG(6L),
		ALL(7L);
		
		public Long id;
		Nivel(Long id){
			this.id = id;
		}
		
		public Long getIdentificador(){
			return id;
		}
		
		public Nivel getByIdentificador(Long identificador){
			return identificador<=Nivel.values().length? Nivel.values()[identificador.intValue()]:null;
		}
	}
}