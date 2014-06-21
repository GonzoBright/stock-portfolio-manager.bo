package com.proserus.stocks.bo.symbols;

import java.math.BigDecimal;


public interface HistoricalPrice {

	public Integer getYear();
	
	public void setYear(Integer year);

	public BigDecimal getPrice();
	
	public void setPrice(BigDecimal price);

	public BigDecimal getCustomPrice();

	public void setCustomPrice(BigDecimal value);

}


