package com.proserus.stocks.model.analysis;

import java.math.BigDecimal;

import com.proserus.stocks.model.symbols.SectorEnum;

public class SectorAnalysisImpl implements SectorAnalysis {

	private BigDecimal financeMarketValue;
	private BigDecimal technologyMarketValue;
	private SectorEnum sector;
	
	
	public BigDecimal getFinanceMarketValue() {
		return financeMarketValue;
	}

	public BigDecimal getTechnologyMarketValue() {
		return technologyMarketValue;
	}

	public void setSector(SectorEnum sector) {
		this.sector = sector;
	}

	@Override
	public SectorEnum getSector() {
		
		return this.sector;
	}

	@Override
	public void setFinanceMarketValue(BigDecimal value) {
		this.financeMarketValue = value;

	}

	@Override
	public void setTechnologyMarketValue(BigDecimal value) {
		this.technologyMarketValue = value;
	}

}
