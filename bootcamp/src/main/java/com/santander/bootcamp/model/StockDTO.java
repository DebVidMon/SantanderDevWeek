package com.santander.bootcamp.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StockDTO {
	
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	@DecimalMin(value = "0.00")
	@Digits(integer = 6, fraction = 2) //>0 e R$ xxx.xxx,xx
	private double preco;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate date;
	@NotNull
	@Digits(integer = 3, fraction = 2)// xxx,xx%
	private Double variacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getVariacao() {
		return variacao;
	}
	public void setVariacao(Double variacao) {
		this.variacao = variacao;
	}
	
	
}
