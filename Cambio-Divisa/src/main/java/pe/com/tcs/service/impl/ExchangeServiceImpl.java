package pe.com.tcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tcs.entity.ExchangeValue;
import pe.com.tcs.repository.ExchangeValueRepository;
import pe.com.tcs.service.ExchangeService;

@Service
public class ExchangeServiceImpl implements ExchangeService{
	
	@Autowired
	private ExchangeValueRepository repository;

	
	
	@Override
	public List<ExchangeValue> findAll() {
		
		return repository.findAll();
	}
	
	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		
		ExchangeValue exchangeValue=repository.findByFromAndTo(from, to);
		return exchangeValue;
	}
	
	
	@Override
	public ExchangeValue saveExchange(ExchangeValue exchangeValue) {
		
		ExchangeValue saveExchange=repository.save(exchangeValue);
		return  saveExchange;
	}


	


	

}
