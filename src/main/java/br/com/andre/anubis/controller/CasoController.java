package br.com.andre.anubis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.andre.anubis.model.Caso;
import br.com.andre.anubis.model.Ficha;
import br.com.andre.anubis.model.Resultado;

@Controller
public class CasoController {
	
	@RequestMapping("/casos")
	@ResponseBody
	public List<Caso> listarCasos() {
		Caso caso1 = new Caso(new Ficha(), new Resultado());
		List<Caso> lista = new ArrayList<>();
		lista.add(caso1);
		return lista;
	}
	

}
