package com.proserus.stocks.bo.transactions;

import com.proserus.stocks.bo.common.PersistentEnum;
import com.proserus.stocks.bo.common.Usage;
import com.proserus.stocks.bo.utils.LoggerUtils;

public enum TransactionType implements PersistentEnum<TransactionType> {
	BUY("BUY", "Buy"), //
	SELL("SELL", "Sell"), //
	DIVIDEND("DIVIDEND", "Dividend"), //
	ERROR("ERROR", "Error", Usage.INTERNAL);

	private String title = null;
	private Usage usage;
	private String id;

	private TransactionType(String id, String title) {
		this(id, title, Usage.VISIBLE);
	}

	private TransactionType(String id, String title, Usage usage) {
		this.id = id;
		this.title = title;
		this.usage = usage;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "TransactionType: name=" + name() + ", id=" + id + ", title=" + title + ", usage=" + usage;
	}

	public String getTitle() {
		return title;
	}

	public boolean isVisible() {
		return Usage.VISIBLE.equals(usage);
	}

	public static TransactionType valueOfById(String id) {
		for (TransactionType enu : values()) {
			if (enu.getId().equals(id)) {
				return enu;
			}
		}
		return null;
	}

}
