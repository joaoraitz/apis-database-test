CREATE SCHEMA `invoice`;

USE `invoice`;

CREATE SEQUENCE hibernate_sequence START WITH 1;

CREATE TABLE fatura (
     numeroDoItemFaturado int NOT NULL,
     descricaoDoItem varchar(255) NOT NULL,
     quantidadeCompradaDoItem int NOT NULL,
     precoUnitarioDoItem double NOT NULL
);
