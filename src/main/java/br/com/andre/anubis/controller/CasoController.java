package br.com.andre.anubis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.anubis.dto.CasoDTO;
import br.com.andre.anubis.dto.FichaDTO;
import br.com.andre.anubis.dto.ResultadoDTO;

@RestController
public class CasoController {

	@RequestMapping("/casos")
	public List<CasoDTO> listarCasos() {
		CasoDTO caso1 = new CasoDTO(new FichaDTO(), new ResultadoDTO());
		List<CasoDTO> lista = new ArrayList<>();
		lista.add(caso1);
		return lista;
	}

}
