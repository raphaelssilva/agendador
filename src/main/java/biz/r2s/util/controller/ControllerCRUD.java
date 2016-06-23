package biz.r2s.util.controller;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

public interface ControllerCRUD<T> {
	
	public String index(ModelMap modelMap);
	public String indexB(ModelMap modelMap);
	public String getFormNew(ModelMap modelMap);
	public String getFormEdit(@RequestParam String id, ModelMap modelMap);
	public String list(ModelMap modelMap);
	public String save(@RequestParam String id, @ModelAttribute T obj, BindingResult result, SessionStatus status, ModelMap modelMap);
	public String delete(@RequestParam String id, SessionStatus status, ModelMap modelMap);
	public String find(@RequestParam String id, ModelMap modelMap);
	List<T> listAjax();
	T saveAjax(T obj);
	T deleteAjax(String id);
	T findAjax(String id);
	
	
}
