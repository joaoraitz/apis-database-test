package com.antarez.jogo.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antarez.jogo.partidas.Luta;
import com.antarez.jogo.sevice.LutaService;

@RestController
@RequestMapping("/api/v1/antarez/jogo")
public class LutaController {

	private ArrayList<Luta> lutaList;

	public LutaController() {
		lutaList = new ArrayList<Luta>();
	}

	@Autowired
	private LutaService lutaService;

	@PostMapping("/batalha")
	public ResponseEntity<?> create(@RequestBody Luta l) {
		lutaService.saveLuta(l);
		if (l == null) {
			return new ResponseEntity<>("Partida invalido", HttpStatus.BAD_REQUEST);
		}
		lutaList.add(l);
		return new ResponseEntity<>(l, HttpStatus.CREATED);
	}
}
