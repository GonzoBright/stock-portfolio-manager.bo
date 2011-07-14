package com.proserus.stocks.model.analysis;

import java.math.BigDecimal;

import com.proserus.stocks.model.symbols.SectorEnum;

public interface SectorAnalysis {

	SectorEnum getSector();
	
	void setFinanceMarketValue(BigDecimal value);
	
	void setTechnologyMarketValue(BigDecimal value);
	
}
