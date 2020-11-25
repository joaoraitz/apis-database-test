package com.antarez.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antarez.invoice.domain.IvoiceEntity;

public interface InvoiceRepository extends JpaRepository<IvoiceEntity , Long>{

}
