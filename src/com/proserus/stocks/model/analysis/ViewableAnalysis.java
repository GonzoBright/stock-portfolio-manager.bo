package com.proserus.stocks.model.analysis;

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

	BigDecimal getCurrentCost();

	BigDecimal getCommission();

	BigDecimal getAveragePrice();

	BigDecimal getAnnualizedReturn();

	BigDecimal getNumberOfYears();
}
