package br.com.cristiano;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

	@RequestMapping("formulario")
	public String form(){
		return "formulario";
	}
	
	@RequestMapping("adicionaCliente")
	public String adicionar(@Valid Cliente cliente, BindingResult result){
		if(result.hasErrors()){
			return "formulario";
		}
		return "adicionada";
	}
}
