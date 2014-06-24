package com.proserus.stocks.bo.enu;

import com.proserus.stocks.bo.transactions.TransactionType;

public class TransactionTypeUserType extends PersistentEnumUserType<TransactionType> {

	@Override
	public Class<TransactionType> returnedClass() {
		return TransactionType.class;
	}
}
