package com.proserus.stocks.model.symbols;

import java.math.BigDecimal;

import org.jfree.data.time.Year;


public interface HistoricalPrice {

	public Year getYear();

	public BigDecimal getPrice();

	public BigDecimal getCustomPrice();

	public void setCustomPrice(BigDecimal value);

}
