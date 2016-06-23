package biz.r2s.agendador.model;

import java.sql.Timestamp;

public class TriggerJob {
	Boolean recorrente;
	Intervalo intervalo;
	Long repetirAcada;
	DiaSemana[] diasDaSemana;
	Long[] diasDoMes;
	Semana[] semanas;
	Timestamp inicio;
	Timestamp fim;
	String cron;
	
	public Boolean getRecorrente() {
		return recorrente;
	}
	public void setRecorrente(Boolean recorrente) {
		this.recorrente = recorrente;
	}
	public Intervalo getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(Intervalo intervalo) {
		this.intervalo = intervalo;
	}
	public Long getRepetirAcada() {
		return repetirAcada;
	}
	public void setRepetirAcada(Long repetirAcada) {
		this.repetirAcada = repetirAcada;
	}
	public DiaSemana[] getDiasDaSemana() {
		return diasDaSemana;
	}
	public void setDiasDaSemana(DiaSemana[] diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}
	public Long[] getDiasDoMes() {
		return diasDoMes;
	}
	public void setDiasDoMes(Long[] diasDoMes) {
		this.diasDoMes = diasDoMes;
	}
	public Semana[] getSemanas() {
		return semanas;
	}
	public void setSemanas(Semana[] semanas) {
		this.semanas = semanas;
	}
	public Timestamp getInicio() {
		return inicio;
	}
	public void setInicio(Timestamp inicio) {
		this.inicio = inicio;
	}
	public Timestamp getFim() {
		return fim;
	}
	public void setFim(Timestamp fim) {
		this.fim = fim;
	}
	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}
}
