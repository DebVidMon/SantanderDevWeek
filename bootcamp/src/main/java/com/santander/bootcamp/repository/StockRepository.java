package com.santander.bootcamp.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.santander.bootcamp.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long>{

	Optional<Stock> findByNomeAndDate(String nome, LocalDate date);
	
//	@Query("SELECT stock " 
//	+"FROM santander.tb_stock "+"WHERE date = :date AND nome = :nome AND id <> :id")
//	Optional<Stock> findUpdate(String nome, LocalDate date, Long id);
//	 
//	 @Query("SELECT stock "+"FROM santander.tb_stock "
//	 +"WHERE date = :date") 
//	 Optional<List<Stock>> findByToday(LocalDate date);
	 
}
