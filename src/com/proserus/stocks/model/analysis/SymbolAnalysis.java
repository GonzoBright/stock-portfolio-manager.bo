package com.proserus.stocks.model.analysis;

import com.proserus.stocks.model.symbols.Symbol;

public interface SymbolAnalysis extends ViewableAnalysis{
	//TODO create another type of Analysis for currency...
	Symbol getSymbol();
 }
