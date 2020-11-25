package com.antarez.invoice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antarez.invoice.models.Invoice;
import com.antarez.invoice.service.InvoiceService;

@RestController
@RequestMapping("/api/v1/antarez/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;

	// curl -H "Content-Type: application/json" --request POST --data \
	// '{"numeroDoItemFaturado":"1",
	// "descricaoDoItem":"", "quantidadeCompradaDoItem":"1",
	// "precoUnitarioDoItem":"50.000" }'
	// \http://localhost:8080/api/v1/antarez/invoice/criaInvoice
	@PostMapping("/criaInvoice")
	public ResponseEntity<?> create(@RequestBody Invoice ni) {
		if (ni == null) {
			return new ResponseEntity<>("Personagem invalido", HttpStatus.BAD_REQUEST);
		}
		invoiceService.saveInvoice(ni);
		return new ResponseEntity<>(ni, HttpStatus.CREATED);
	}
}
