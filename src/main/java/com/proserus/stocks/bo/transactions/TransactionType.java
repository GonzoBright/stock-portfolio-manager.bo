package com.proserus.stocks.bo.transactions;

import com.proserus.stocks.bo.common.Usage;

public enum TransactionType {
    BUY("Buy"), SELL("Sell"), DIVIDEND("Dividend"), ERROR("Error", Usage.INTERNAL);

    private String title = null;
    private Usage usage;

    private TransactionType(String title) {
        this(title, Usage.VISIBLE);
    }

    private TransactionType(String title, Usage usage) {
        this.title = title;
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "TransactionType: name=" + name() + ", title=" + title + ", usage=" + usage;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVisible() {
        return Usage.VISIBLE.equals(usage);
    }

}
