package biz.r2s.agendador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.agendador.model.Agendamento;
import biz.r2s.agendador.service.AgendamentoService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping(value="/agendamento")
public class AgendamentoController extends ControllerCRUDAbstract<Agendamento>{
	
	
	@Autowired
	public void setUsuarioService(AgendamentoService agendamentoService) {
		this.serviceCRUD = agendamentoService;
		this.path = "agendamento";
	}
}
