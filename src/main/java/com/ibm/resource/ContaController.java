package com.ibm.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.record.ClienteRecord;
import com.ibm.service.ContaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	private ContaService contaService;

	@PostMapping("/save")
	public ResponseEntity<ClienteRecord> save(@Valid @RequestBody ClienteRecord clienteRecord) {
		return ResponseEntity.status(HttpStatus.CREATED).body(contaService.save(clienteRecord));
	}
}
