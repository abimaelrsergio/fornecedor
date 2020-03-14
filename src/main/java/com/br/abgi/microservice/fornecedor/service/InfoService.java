package com.br.abgi.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.abgi.microservice.fornecedor.model.InfoFornecedor;
import com.br.abgi.microservice.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {

 		InfoFornecedor infoFornecedor = infoRepository.findByEstado(estado);

		return infoFornecedor;
	}

}
