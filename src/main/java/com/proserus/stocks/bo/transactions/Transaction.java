package com.proserus.stocks.bo.transactions;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;

import com.proserus.stocks.bo.symbols.Symbol;

public interface Transaction {

	public static String IN_LABELS = "in elements(t.labels)";

	// TODO Maybe the same label can be set twice
	public abstract void addLabel(Label label);

	public abstract BigDecimal getCommission();

	public abstract Calendar getCalendar();

	public abstract Integer getId();

	public abstract Collection<Label> getLabelsValues();

	public abstract BigDecimal getPrice();

	public abstract BigDecimal getQuantity();

	public abstract Symbol getSymbol();

	public abstract TransactionType getType();

	public abstract void removeLabel(Label label);

	public abstract void setCommission(BigDecimal commission);

	public abstract void setCalendar(Calendar calendar);

	// TODO Maybe the same label can be set twice
	// When removing labels.. we need to remove the transaction link too...
	public abstract void setLabels(Collection<Label> labels);

	public abstract void setPrice(BigDecimal price);

	public abstract void setQuantity(BigDecimal quantity);

	public abstract void setSymbol(Symbol symbol);

	public abstract void setType(TransactionType type);

}