package com.antarez.jogo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antarez.jogo.personagens.Personagem;
import com.antarez.jogo.sevice.PersonagemService;

@RestController
@RequestMapping("/api/v1/antarez/jogo")
public class PersoagemController {

	@Autowired
	private PersonagemService personagemService;

	/*
	 * curl -H "Content-Type: application/json" --request POST --data \
	 * '{"Nome":"Bin Laden", "Nacionalidade":"Paquistao",
	 * "Frase de efeito":"halabalala" }' \ http://localhost:8080/criapersonagem
	 */
	@PostMapping("/criapersonagem")
	public ResponseEntity<?> create(@RequestBody Personagem np) {
		if (np == null) {
			return new ResponseEntity<>("Personagem invalido", HttpStatus.BAD_REQUEST);
		}
		personagemService.savePersonagem(np);
		return new ResponseEntity<>(np, HttpStatus.CREATED);
	}
}
