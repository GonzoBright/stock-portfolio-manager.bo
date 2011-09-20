package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.proserus.stocks.bo.symbols.CurrencyEnum;
import com.proserus.stocks.bo.symbols.Symbol;

public interface Analysis extends CurrencyAnalysis, SymbolAnalysis {

	void setQuantity(BigDecimal value);

	void setTotalCost(BigDecimal value);
	
	void setCostBasis(BigDecimal value);

	void setAveragePrice(BigDecimal value);

	void setCommission(BigDecimal value);

	void setCurrency(CurrencyEnum currency);
	
	void setDividend(BigDecimal value);

	void setDividendYield(BigDecimal value);

	void setMarketGrowth(BigDecimal value);

	void setMarketValue(BigDecimal value);

	void setSymbol(Symbol symbol);

	void setCapitalGain(BigDecimal value);

	void setOverallReturn(BigDecimal value);

	void setTotalSold(BigDecimal value);

	void setStartOfPeriod(DateTime date);

	DateTime getStartOfPeriod();

	void setEndOfPeriod(DateTime date);

	DateTime getEndOfPeriod();
	
	void setNumberOfYears(BigDecimal years);
	
	void setAnnualizedReturn(BigDecimal value);

	BigDecimal getTotalSold();

	void setQuantityBuy(BigDecimal value);

	BigDecimal getQuantityBuy();

	void setQuantitySold(BigDecimal value);

	BigDecimal getQuantitySold();

}