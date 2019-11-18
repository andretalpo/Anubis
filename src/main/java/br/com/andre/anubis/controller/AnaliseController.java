package br.com.andre.anubis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnaliseController {
	
	@RequestMapping("/analise")
	@ResponseBody
	public String analisarCaso() {
		return "ooi";
	}
}
