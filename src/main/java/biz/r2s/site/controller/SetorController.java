package biz.r2s.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/setor")
public class SetorController {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("setor.index");
		view.addObject("current","setor");		
		return view;
	}

	@RequestMapping(value = "")
	public ModelAndView index2() {
		ModelAndView view = new ModelAndView();
		view.setViewName("setor.index");
		view.addObject("current","setor");		
		return view;
	}
}