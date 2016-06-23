package biz.r2s.site.controller;

import javax.mail.Message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import biz.r2s.util.EmailUtil;

@Controller
@RequestMapping(value = "/contato")
public class ContatoController {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("contato.index");
		view.addObject("current","contato");		
		return view;
	}

	@RequestMapping(value = "")
	public ModelAndView index2() {
		ModelAndView view = new ModelAndView();
		view.setViewName("contato.index");
		view.addObject("current","contato");		
		return view;
	}

	@RequestMapping(value = "/sendEmail")
	public ModelAndView sendEmail(String nome, String empresa, String email,
			String telefone, String assunto, String mensagem) {

		ModelAndView view = new ModelAndView();
		view.addObject("current","contato");	
		mensagem = "Nome: " + nome + "\nEmpresa: " + empresa + "\nEmail: "
				+ email + "\nTelefone: " + telefone + "\nAssunto: " + assunto
				+ "\nMensagem: " + mensagem;

		boolean retorno = enviarEmail(assunto, email, mensagem);
		if (retorno) {
			view.addObject("message", "Enviado com sucesso.");
			view.setViewName("contato.sucesso");
		} else {
			view.addObject("message", "Erro ao enviar mensagem.");
			view.setViewName("contato.index");
		}

		return view;
	}

	private boolean enviarEmail(String assunto, String de, String mensagem) {
		Message email = EmailUtil.criarEmail("raphael@r2s.biz", de, assunto,
				mensagem);
		if (email != null) {
			return EmailUtil.send(email);
		}

		return false;
	}

	@RequestMapping(value = "/mapa")
	public ModelAndView mapa() {
		ModelAndView view = new ModelAndView();
		view.setViewName("contato.mapa");
		view.addObject("current","contato");		
		return view;
	}
}