package com.proserus.stocks.bo.transactions;

public enum TransactionType {
	BUY("Buy"), SELL("Sell"), DIVIDEND("Dividend");

	private String title = null;

	private TransactionType(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}
