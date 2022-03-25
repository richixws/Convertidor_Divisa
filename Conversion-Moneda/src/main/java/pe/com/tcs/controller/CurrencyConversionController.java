package pe.com.tcs.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import pe.com.tcs.dto.CurrencyConversionBean;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin("http://localhost:4200")
@RestController
public class CurrencyConversionController {

	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,
												  @PathVariable String to, 
												  @PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity= new RestTemplate().getForEntity("http://localhost:8200/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,uriVariables);
		CurrencyConversionBean response=responseEntity.getBody();
		
		return new CurrencyConversionBean(from, to, response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()),response.getNombre());
		
	}
	
}
