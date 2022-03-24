package pe.com.tcs.service;

import java.util.List;

import pe.com.tcs.entity.ExchangeValue;

public interface ExchangeService {

	public ExchangeValue findByFromAndTo(String from, String to);
	
	public ExchangeValue saveExchange(ExchangeValue exchangeValue);
	
	public List<ExchangeValue> findAll();
	
	
}
