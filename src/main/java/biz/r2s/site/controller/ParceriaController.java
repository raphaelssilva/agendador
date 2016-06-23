package biz.r2s.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/parceria")
public class ParceriaController {

	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("parceria.index");
		view.addObject("current","parceria");
		
		return view;
	}

	@RequestMapping(value = "")
	public ModelAndView index2() {
		ModelAndView view = new ModelAndView();
		view.setViewName("parceria.index");
		view.addObject("current","parceria");		
		return view;
	}
}