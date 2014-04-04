package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;

import com.proserus.stocks.bo.transactions.Label;

public interface LabelAnalysis {

	Label getLabel();
	
	BigDecimal getMarketValue();
	
}
