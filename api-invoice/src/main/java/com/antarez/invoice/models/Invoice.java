package com.antarez.invoice.models;

public class Invoice {

	private Integer numeroDoItemFaturado;
	private String descricaoDoItem;
	private Integer quantidadeCompradaDoItem;
	private Double precoUnitarioDoItem;

//	public Invoice() {
//		numeroDoItemFaturado = 1;
//		descricaoDoItem = "";
//		quantidadeCompradaDoItem = 1;
//		precoUnitarioDoItem = 50.000;
//	}

	public Integer getNumeroDoItemFaturado() {
		return numeroDoItemFaturado;
	}

	public void setNumeroDoItemFaturado(Integer numeroDoItemFaturado) {
		this.numeroDoItemFaturado = numeroDoItemFaturado;
	}

	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}

	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}

	public Integer getQuantidadeCompradaDoItem() {
		return quantidadeCompradaDoItem;
	}

	public void setQuantidadeCompradaDoItem(Integer quantidadeCompradaDoItem) {
		this.quantidadeCompradaDoItem = quantidadeCompradaDoItem;
	}

	public Double getPrecoUnitarioDoItem() {
		return precoUnitarioDoItem;
	}

	public void setPrecoUnitarioDoItem(Double precoUnitarioDoItem) {
		this.precoUnitarioDoItem = precoUnitarioDoItem;
	}

	public Double getInvoiceAmount() {
		Double fatura = getQuantidadeCompradaDoItem() * getPrecoUnitarioDoItem();
		return fatura;
	}
}
