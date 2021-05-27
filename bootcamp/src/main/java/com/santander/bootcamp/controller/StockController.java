package com.santander.bootcamp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.bootcamp.model.StockDTO;

@RestController
@RequestMapping(value="/stock")
public class StockController {

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){
		return ResponseEntity.ok(dto);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StockDTO>> getAll(){
		List<StockDTO> lista = new ArrayList<>();
		StockDTO dto1 = new StockDTO();
		dto1.setId(1L);
		dto1.setNome("Magalu");
		dto1.setPreco(1000);
		dto1.setVariacao(10.0);
		dto1.setDate(LocalDate.now());
		StockDTO dto2 = new StockDTO();
		dto2.setId(1L);
		dto2.setNome("Pinguin");
		dto2.setPreco(800);
		dto2.setVariacao(20.0);
		dto2.setDate(LocalDate.now());
		lista.add(dto1);
		lista.add(dto2);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> findByID(@PathVariable Long id){
		List<StockDTO> lista = new ArrayList<>();
		StockDTO dto1 = new StockDTO();
		dto1.setId(1L);
		dto1.setNome("Magalu");
		dto1.setPreco(1000);
		dto1.setVariacao(10.0);
		dto1.setDate(LocalDate.now());
		StockDTO dto2 = new StockDTO();
		dto2.setId(1L);
		dto2.setNome("Pinguin");
		dto2.setPreco(800);
		dto2.setVariacao(20.0);
		dto2.setDate(LocalDate.now());
		lista.add(dto1);
		lista.add(dto2);
		StockDTO selecionado = lista.stream().filter( x -> x.getId().compareTo(id) == 0).findFirst().get();
		return ResponseEntity.ok(selecionado);
	}
	
	/*
	 * @GetMapping(value="/hoje",produces = MediaType.APPLICATION_JSON_VALUE) public
	 * ResponseEntity<List<StockDTO>> getByDate(){ List<StockDTO> lista = new
	 * ArrayList<>(); StockDTO dto1 = new StockDTO(); dto1.setId(1L);
	 * dto1.setNome("Magalu"); dto1.setPreco(1000); dto1.setVariacao(10.0);
	 * dto1.setDate(LocalDate.now()); StockDTO dto2 = new StockDTO();
	 * dto2.setId(1L); dto2.setNome("Pinguin"); dto2.setPreco(800);
	 * dto2.setVariacao(20.0); dto2.setDate(LocalDate.now()); lista.add(dto1);
	 * lista.add(dto2); return ResponseEntity.ok(lista); }
	 */
	
	
}
