package com.ibm.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;
import com.ibm.record.TransacaoRecord;
import com.ibm.service.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/save")
	public ResponseEntity<ClienteRecord> save(@Valid @RequestBody ClienteRecord clienteRecord) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(clienteRecord));
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<ClienteDTO> buscar(@RequestParam("agencia") String agencia, 
			@RequestParam("conta") String conta, @RequestParam("senha") String senha) {
		return ResponseEntity.ok(clienteService.buscar(agencia, conta, senha));
	}
	
	@PostMapping("/depositar")
	public ResponseEntity<?> depositar(@Valid @RequestBody TransacaoRecord transacaoRecord) {
		clienteService.depositar(transacaoRecord);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/debitar")
	public ResponseEntity<?> debitar(@Valid @RequestBody TransacaoRecord transacaoRecord) {
		clienteService.debitar(transacaoRecord);
		return ResponseEntity.ok().build();
	}
}
