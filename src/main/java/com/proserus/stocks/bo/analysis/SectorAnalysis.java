package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;

import com.proserus.stocks.bo.symbols.SectorEnum;

public interface SectorAnalysis {

	SectorEnum getSector();
	
	BigDecimal getMarketValue();
	
}
