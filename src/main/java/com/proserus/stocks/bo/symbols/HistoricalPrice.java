package com.proserus.stocks.bo.symbols;

import java.math.BigDecimal;

import org.jfree.data.time.Year;


public interface HistoricalPrice {

	public Year getYear();
	
	public void setYear(Year year);//FIXME Year JFree

	public BigDecimal getPrice();
	
	public void setPrice(BigDecimal price);

	public BigDecimal getCustomPrice();

	public void setCustomPrice(BigDecimal value);

}


