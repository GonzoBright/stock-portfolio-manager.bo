package com.proserus.stocks.bo.analysis;

import com.proserus.stocks.bo.symbols.CurrencyEnum;

public interface CurrencyAnalysis extends ViewableAnalysis{
	//TODO create another type of Analysis for currency...
	CurrencyEnum getCurrency();
	
 }
