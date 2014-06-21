package com.proserus.stocks.bo.common;

import com.proserus.stocks.bo.symbols.HistoricalPrice;
import com.proserus.stocks.bo.symbols.Symbol;
import com.proserus.stocks.bo.transactions.Label;
import com.proserus.stocks.bo.transactions.Transaction;

public interface BoBuilder {
	public Transaction getTransaction();
	public Symbol getSymbol();
	public Label getLabel();
	public HistoricalPrice getHistoricalPrice();
	public DBVersion getVersion();
}
