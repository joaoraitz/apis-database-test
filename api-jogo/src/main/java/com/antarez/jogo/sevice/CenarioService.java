package com.antarez.jogo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.antarez.jogo.cenarios.Afeganistao;
import com.antarez.jogo.cenarios.Cenario;
import com.antarez.jogo.domain.CenarioEntity;
import com.antarez.jogo.repository.CenarioRepository;

@Component
public class CenarioService {

	@Autowired
	private CenarioRepository cenarioRepository;

	private CenarioEntity convertCenarioToEntity(Cenario cenario) {
		CenarioEntity entity = new CenarioEntity();
		entity.setNome(cenario.getNome());
		entity.setIdPersonagem(cenario.getIdPersonagem());
		return entity;
	}

	public void saveCenario(Cenario cenario) {
		cenarioRepository.saveAndFlush(convertCenarioToEntity(cenario));
	}
}
