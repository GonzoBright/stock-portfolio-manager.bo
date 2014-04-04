package com.proserus.stocks.bo.analysis;

import com.proserus.stocks.bo.symbols.Symbol;

public interface SymbolAnalysis extends ViewableAnalysis{
	//TODO create another type of Analysis for currency...
	Symbol getSymbol();
 }
