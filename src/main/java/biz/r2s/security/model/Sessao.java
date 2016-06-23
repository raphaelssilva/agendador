package biz.r2s.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import biz.r2s.util.model.MongoDBModel;

public class Sessao implements Serializable,MongoDBModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private Usuario usuario;
	
	private Date inicioAcesso;

	private Date fimAcesso;
	
	private String ip;
	
	private String cookie;
	
	private Boolean isAtivo;
	
	private List<LogAcesso> logAcessoList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getInicioAcesso() {
		return inicioAcesso;
	}
	public void setInicioAcesso(Date inicioAcesso) {
		this.inicioAcesso = inicioAcesso;
	}
	public Date getFimAcesso() {
		return fimAcesso;
	}
	public void setFimAcesso(Date fimAcesso) {
		this.fimAcesso = fimAcesso;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public List<LogAcesso> getLogAcessoList() {
		return logAcessoList;
	}
	public void setLogAcessoList(List<LogAcesso> logAcessoList) {
		this.logAcessoList = logAcessoList;
	}	
	
}
