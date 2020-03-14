package com.br.abgi.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.abgi.microservice.fornecedor.model.InfoFornecedor;
import com.br.abgi.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;

	@GetMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {

		System.out.println("Estado: " + estado);
		
		InfoFornecedor infoFornecedor = infoService.getInfoPorEstado(estado);

		System.out.println(infoFornecedor);

		return infoFornecedor;
	}
}
