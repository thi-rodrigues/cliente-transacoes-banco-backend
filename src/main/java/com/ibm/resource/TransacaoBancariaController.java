package com.ibm.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.domain.dto.TransacaoBancariaDTO;
import com.ibm.service.TransacaoBancariaService;

@RestController
@RequestMapping("transacao-bancaria")
public class TransacaoBancariaController {
	
	@Autowired
	private TransacaoBancariaService transacaoBancariaService;
	
	@GetMapping("/{id}")
	public ResponseEntity<List<TransacaoBancariaDTO>> buscarTodas(@PathVariable("id") Long idCliente) {
		return ResponseEntity.ok(transacaoBancariaService.buscarTodas(idCliente));
	}

}
