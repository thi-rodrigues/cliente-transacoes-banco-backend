package com.ibm.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ibm.domain.Cliente;
import com.ibm.domain.Conta;
import com.ibm.record.ClienteDTO;
import com.ibm.record.ClienteRecord;
import com.ibm.record.TransacaoRecord;
import com.ibm.repository.ClienteRepository;
import com.ibm.service.ClienteService;
import com.ibm.service.ContaService;

import jakarta.validation.Valid;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ContaService contaService;

	@Override
	public ClienteRecord save(@Valid ClienteRecord clienteRecord) {
		Cliente cliente = new Cliente();
		// TODO: senha
		BeanUtils.copyProperties(clienteRecord, cliente);

		Conta conta = contaService.save(clienteRecord.conta());
		cliente.setConta(conta);

		clienteRepository.save(cliente);
		return clienteRecord;
	}

	@Override
	public ClienteDTO buscar(String agencia, String conta, String senha) {
		Optional<Cliente> cliente = clienteRepository.buscar(agencia, conta, senha);
		ClienteDTO clienteDTO = new ClienteDTO();

		cliente.ifPresent(c -> BeanUtils.copyProperties(c, clienteDTO));
		return clienteDTO;
	}
	
	@Override
	public void depositar(TransacaoRecord transacaoRecord) {
		contaService.depositar(transacaoRecord.valor(), transacaoRecord.numeroConta(), transacaoRecord.idCliente());
	}

	@Override
	public void debitar(@Valid TransacaoRecord transacaoRecord) {
		contaService.debitar(transacaoRecord.valor(), transacaoRecord.numeroConta(), transacaoRecord.idCliente());
	}

	@Override
	public Page<ClienteDTO> buscarTodos(int page, int size) {
		return clienteRepository.buscarTodos(obterRequisicaoPaginada(page,  size));
	}
	
	private PageRequest obterRequisicaoPaginada(int page, int size) {
		return PageRequest.of(page, size);
	}

}
