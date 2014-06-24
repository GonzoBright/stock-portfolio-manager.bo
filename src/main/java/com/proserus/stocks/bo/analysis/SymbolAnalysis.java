package com.proserus.stocks.bo.analysis;

import com.proserus.stocks.bo.symbols.Symbol;

public interface SymbolAnalysis extends ViewableAnalysis {
	Symbol getSymbol();
}
