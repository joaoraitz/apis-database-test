package com.antarez.jogo.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antarez.jogo.cenarios.Afeganistao;
import com.antarez.jogo.cenarios.Cenario;
import com.antarez.jogo.cenarios.Colombia;
import com.antarez.jogo.sevice.CenarioService;

@RestController
@RequestMapping("/api/v1/antarez/jogo")
public class CenarioController {

	private ArrayList<Cenario> cenarioList;

	public CenarioController() {
		cenarioList = new ArrayList<Cenario>();
	}

	@Autowired
	private CenarioService cenarioService;

	@PostMapping("/cenario")
	public ResponseEntity<?> create(@RequestBody Afeganistao nc) {
		cenarioService.saveCenario(nc);
		if (nc == null) {
			return new ResponseEntity<>("cenario invalido", HttpStatus.BAD_REQUEST);
		}
		cenarioList.add(nc);
		return new ResponseEntity<>(nc, HttpStatus.CREATED);
	}
}
