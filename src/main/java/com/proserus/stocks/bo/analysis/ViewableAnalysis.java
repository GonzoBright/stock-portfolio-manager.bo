package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;

public interface ViewableAnalysis {
	BigDecimal getMarketValue();

	BigDecimal getMarketGrowth();

	BigDecimal getDividend();

	BigDecimal getDividendYield();

	BigDecimal getCapitalGain();

	BigDecimal getCapitalGainPercent();

	BigDecimal getOverallReturn();

	BigDecimal getQuantity();

	BigDecimal getTotalCost();
	
	BigDecimal getCostBasis();

	BigDecimal getCommission();

	BigDecimal getAveragePrice();

	BigDecimal getAnnualizedReturn();

	BigDecimal getNumberOfYears();
	
	String getSnapshot();
}
