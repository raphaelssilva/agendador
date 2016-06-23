/**
 * 
 */
/**
 * @author FI7L
 *
 */
package biz.r2s.agendador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.agendador.DAO.AgendamentoDAO;
import biz.r2s.agendador.model.Agendamento;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class AgendamentoService extends ServiceCRUDAbstract<Agendamento>{
	
	@Autowired
	public void setJobDAO(AgendamentoDAO agendamentoDAO) {
		this.dao = agendamentoDAO;
	}
}
