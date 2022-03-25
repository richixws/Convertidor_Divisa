package pe.com.tcs.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tcs.entity.ExchangeValue;
import pe.com.tcs.repository.ExchangeValueRepository;
import pe.com.tcs.service.ExchangeService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CurrencyConversionController {

	
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  private final String nombre ="Richard Wong Solorzano";

	
  @Autowired
  private ExchangeService exchangeService;
	
  
  @GetMapping("/currency-exchange")
  public List<ExchangeValue> listarMonedas(){

	 return exchangeService.findAll(); 
  }

	
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue convertirMoneda(@PathVariable String from, @PathVariable String to) {
  
     ExchangeValue exchangeValue=exchangeService.findByFromAndTo(from, to);
    // logger.info("INFO:",exchangeValue.getId()+","+exchangeValue.getTo()+","+exchangeValue.getFrom()+","+exchangeValue.getConversionMultiple());
	 exchangeValue.setNombre(nombre);
     return exchangeValue;
	  
  }
  
  @PostMapping("/currency-exchange/save")
  public ResponseEntity<?> agregarTipoCambio(@RequestBody ExchangeValue exchangeValue) {
	  
	  ExchangeValue saveExchange=exchangeService.saveExchange(exchangeValue);
	  saveExchange.setNombre(nombre);
	  return new ResponseEntity<>(saveExchange, HttpStatus.CREATED);
	  
  }
	 
	
	
}
