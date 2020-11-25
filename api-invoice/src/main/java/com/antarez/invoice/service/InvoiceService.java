package com.antarez.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.antarez.invoice.domain.IvoiceEntity;
import com.antarez.invoice.models.Invoice;
import com.antarez.invoice.repository.InvoiceRepository;

@Component
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	private IvoiceEntity convertInvoiceToEntity(Invoice invoice) {
		IvoiceEntity entity = new IvoiceEntity();
		entity.setNumeroDoItemFaturado(invoice.getNumeroDoItemFaturado());
		entity.setDescricaoDoItem(invoice.getDescricaoDoItem());
		entity.setQuantidadeCompradaDoItem(invoice.getQuantidadeCompradaDoItem());
		entity.setPrecoUnitarioDoItem(invoice.getPrecoUnitarioDoItem());
		return entity;
	}

	public void saveInvoice(Invoice invoice) {
		invoiceRepository.saveAndFlush(convertInvoiceToEntity(invoice));
	}
}
