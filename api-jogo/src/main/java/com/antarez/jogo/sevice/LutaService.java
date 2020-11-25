package com.antarez.jogo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.antarez.jogo.domain.LutaEntity;
import com.antarez.jogo.partidas.Luta;
import com.antarez.jogo.repository.LutaRepository;

@Component
public class LutaService {

	@Autowired
	private LutaRepository lutaRepository;

	private LutaEntity convertLuta(Luta luta) {
		LutaEntity entity = new LutaEntity();
		entity.setId_lutador1(luta.getId_lutador1());
		entity.setId_lutador2(luta.getId_lutador2());
		entity.setTempo(luta.getTempo());
		return entity;
	}

	public void saveLuta(Luta luta) {
		lutaRepository.saveAndFlush(convertLuta(luta));
	}
}
