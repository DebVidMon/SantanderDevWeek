package com.santander.bootcamp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.bootcamp.exception.NotFoundException;
import com.santander.bootcamp.exception.StockException;
import com.santander.bootcamp.model.Stock;
import com.santander.bootcamp.model.StockDTO;
import com.santander.bootcamp.repository.StockRepository;
import com.santander.bootcamp.repository.mapper.StockMapper;
import com.santander.bootcamp.util.MensagemUtil;

import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {
	
	@Autowired
	public StockRepository repository;
	
	@Autowired
	public StockMapper mapper;
	
	@Transactional
	public StockDTO save(StockDTO dto) {
		Optional<Stock> optionalStock = repository.findByNomeAndDate(dto.getNome(),dto.getDate());
		if(optionalStock.isPresent()) {
			throw new StockException(MensagemUtil.JA_TEM);
		}
		Stock stock = mapper.toEntity(dto);
		repository.save(stock);
		return mapper.toDTO(stock);
	}

	@Transactional
	public StockDTO update(StockDTO dto) {
		
//		 Optional<Stock> optionalStock =
//		 repository.findUpdate(dto.getNome(),dto.getDate(),dto.getId());
//		 if(optionalStock.isPresent()) { throw new
//		 StockException(MensagemUtil.JA_TEM); }
//		 
		Stock stock = mapper.toEntity(dto);
		repository.save(stock);
		return mapper.toDTO(stock);
	} 
	
	@Transactional //(readOnly = true)
	public List<StockDTO> findAll(){
		return mapper.toDTO(repository.findAll());
	}
	
	@Transactional //(readOnly = true)
	public StockDTO findById(Long id){
		return repository.findById(id).map(mapper:: toDTO).orElseThrow(NotFoundException::new);
	}
	
	@Transactional
	public StockDTO delete(Long id) {
		StockDTO dto = this.findById(id);
		repository.deleteById(dto.getId());
		return dto;
	}
	
//	 @Transactional public List<StockDTO> findByToday() {
//		 return repository.findByToday(LocalDate.now())
//				 .map(mapper::toDTO).orElseThrow(NotFoundException::new); }
	 

}
