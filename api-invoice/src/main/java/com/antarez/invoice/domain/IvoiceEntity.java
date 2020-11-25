package com.antarez.invoice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "fatura")
public class IvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer numeroDoItemFaturado;
	private String descricaoDoItem;
	private Integer quantidadeCompradaDoItem;
	private Double precoUnitarioDoItem;

}
