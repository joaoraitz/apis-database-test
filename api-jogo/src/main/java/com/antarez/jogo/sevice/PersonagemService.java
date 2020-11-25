package com.antarez.jogo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.antarez.jogo.domain.PersonagemEntity;
import com.antarez.jogo.personagens.Personagem;
import com.antarez.jogo.repository.PersonagemRepository;

@Component
public class PersonagemService {

	@Autowired
	private PersonagemRepository personagemRepository;

	private PersonagemEntity convertPersonagemToEntity(Personagem personagem) {
		PersonagemEntity entity = new PersonagemEntity();
		entity.setNome(personagem.getNome());
		entity.setNacionalidade(personagem.getNacionalidade());
		entity.setFraseDeEfeito(personagem.getFraseDeEfeito());
		return entity;
	}

	public void savePersonagem(Personagem personagem) {
		personagemRepository.saveAndFlush(convertPersonagemToEntity(personagem));
	}
}
