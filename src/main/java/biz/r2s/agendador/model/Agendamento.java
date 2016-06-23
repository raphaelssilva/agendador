/**
 * 
 */
/**
 * @author FI7L
 *
 */
package biz.r2s.agendador.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.web.bind.annotation.RequestMethod;

import biz.r2s.util.model.MongoDBModel;

public class Agendamento implements MongoDBModel {
	String id;
	String nome;
	String grupo;
	String descricao;
	@Transient
	TypeAction acao;
	@Transient
	RequestMethod metodo;
	String url;
	@Transient
	TriggerJob trigger;
	String usuarioId;
	Date ultimoExecucao;
	Date proximaExecucao;
	String jobClassName;
	String dispatcherJobClassName;
	@Transient
	List<LogAgendamento> logs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TypeAction getAcao() {
		return acao;
	}

	public void setAcao(TypeAction acao) {
		this.acao = acao;
	}

	public RequestMethod getMetodo() {
		return metodo;
	}

	public void setMetodo(RequestMethod metodo) {
		this.metodo = metodo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TriggerJob getTrigger() {
		return trigger;
	}

	public void setTrigger(TriggerJob trigger) {
		this.trigger = trigger;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public List<LogAgendamento> getLogs() {
		return logs;
	}

	public void setLogs(List<LogAgendamento> logs) {
		this.logs = logs;
	}

	public Date getUltimoExecucao() {
		return ultimoExecucao;
	}

	public void setUltimoExecucao(Date ultimoExecucao) {
		this.ultimoExecucao = ultimoExecucao;
	}

	public Date getProximaExecucao() {
		return proximaExecucao;
	}

	public void setProximaExecucao(Date proximaExecucao) {
		this.proximaExecucao = proximaExecucao;
	}

	public String getJobClassName() {
		return jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}

	public String getDispatcherJobClassName() {
		return dispatcherJobClassName;
	}

	public void setDispatcherJobClassName(String dispatcherJobClassName) {
		this.dispatcherJobClassName = dispatcherJobClassName;
	}
	
	
}