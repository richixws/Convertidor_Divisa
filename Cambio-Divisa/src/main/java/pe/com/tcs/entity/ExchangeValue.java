package pe.com.tcs.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ExchangeValue implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "moneda_de")
	private String from;

	@Column(name = "moneda_a")
	private String to;

	@Column(name = "conversion")
	private BigDecimal conversionMultiple;
	
//	private BigDecimal quantity;
	
//	private BigDecimal totalCalculatedAmount;
	
	

	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public CurrencyConversion(Long id, String from, String to, BigDecimal
	 * conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount) {
	 * super(); this.id = id; this.from = from; this.to = to;
	 * this.conversionMultiple = conversionMultiple; this.quantity = quantity;
	 * this.totalCalculatedAmount = totalCalculatedAmount; }
	 */


	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	



	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	private static final long serialVersionUID = 1L;

	
}
