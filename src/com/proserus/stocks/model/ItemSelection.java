package com.proserus.stocks.model;

import com.proserus.stocks.model.common.ObservableModel;
import com.proserus.stocks.model.symbols.Symbol;
import com.proserus.stocks.model.transactions.Transaction;

public class ItemSelection extends ObservableModel{
	private Symbol selectedSymbol = null;
	private Transaction selectedTransaction = null;
	public Symbol getSelectedSymbol() {
    	return selectedSymbol;
    }
	public void setSelectedSymbol(Symbol selectedSymbol) {
    	this.selectedSymbol = selectedSymbol;
    	setChanged();
    	notifyObservers();
    }
	public Transaction getSelectedTransaction() {
    	return selectedTransaction;
    }
	public void setSelectedTransaction(Transaction selectedTransaction) {
    	this.selectedTransaction = selectedTransaction;
    	setChanged();
    	notifyObservers();
    }
}
