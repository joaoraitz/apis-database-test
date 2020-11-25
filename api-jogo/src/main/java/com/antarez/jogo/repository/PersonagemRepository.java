package com.antarez.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antarez.jogo.domain.PersonagemEntity;

public interface PersonagemRepository extends JpaRepository<PersonagemEntity, Long> {

}
