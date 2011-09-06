package com.proserus.stocks.model.common;

import com.proserus.stocks.model.symbols.HistoricalPrice;
import com.proserus.stocks.model.symbols.Symbol;
import com.proserus.stocks.model.transactions.Label;
import com.proserus.stocks.model.transactions.Transaction;

public interface BoBuilder {
	public Transaction getTransaction();
	public Symbol getSymbol();
	public Label getLabel();
	public HistoricalPrice getHistoricalPrice();
}
