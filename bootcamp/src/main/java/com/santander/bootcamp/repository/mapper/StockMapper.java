package com.santander.bootcamp.repository.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.santander.bootcamp.model.Stock;
import com.santander.bootcamp.model.StockDTO;

@Component
public class StockMapper {

	public Stock toEntity(StockDTO dto) {
		Stock stock = new Stock();
		stock.setId(dto.getId());
		stock.setNome(dto.getNome());
		stock.setPreco(dto.getPreco());
		stock.setVariacao(dto.getVariacao());
		stock.setDate(dto.getDate());
		return stock;
	}
	
	public StockDTO toDTO(Stock stock) {
		StockDTO dto = new StockDTO();
		dto.setId(stock.getId());
		dto.setNome(stock.getNome());
		dto.setPreco(stock.getPreco());
		dto.setVariacao(stock.getVariacao());
		dto.setDate(stock.getDate());
		return dto;
	}

	public List<StockDTO> toDTO(List<Stock> lista) {
		
		return lista.stream().map(this::toDTO).collect(Collectors.toList());
	}

}
