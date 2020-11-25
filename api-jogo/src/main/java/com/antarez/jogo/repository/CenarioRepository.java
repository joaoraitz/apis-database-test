package com.antarez.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antarez.jogo.domain.CenarioEntity;

public interface CenarioRepository extends JpaRepository<CenarioEntity, Long> {

}
