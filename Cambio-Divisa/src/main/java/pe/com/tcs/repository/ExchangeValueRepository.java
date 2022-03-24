package pe.com.tcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.tcs.entity.ExchangeValue;


public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	public ExchangeValue findByFromAndTo(String from, String to);
	
}
