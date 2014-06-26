package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;
import java.util.Calendar;

import com.proserus.stocks.bo.symbols.CurrencyEnum;
import com.proserus.stocks.bo.symbols.SectorEnum;
import com.proserus.stocks.bo.symbols.Symbol;
import com.proserus.stocks.bo.transactions.Label;

public interface Analysis extends CurrencyAnalysis, SymbolAnalysis, SectorAnalysis, LabelAnalysis, YearAnalysis {

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

	void setSector(SectorEnum sector);

	void setLabel(Label label);

	void setCapitalGain(BigDecimal value);

	void setOverallReturn(BigDecimal value);

	void setTotalSold(BigDecimal value);

	void setStartOfPeriod(Calendar date);

	Calendar getStartOfPeriod();

	void setEndOfPeriod(Calendar endDate);

	Calendar getEndOfPeriod();

	void setNumberOfYears(BigDecimal years);

	void setAnnualizedReturn(BigDecimal value);

	BigDecimal getTotalSold();

	void setYear(int year);

	int getYear();

	Label getLabel();

	void setQuantityBuy(BigDecimal value);

	BigDecimal getQuantityBuy();

	void setQuantitySold(BigDecimal value);

	BigDecimal getQuantitySold();
}
