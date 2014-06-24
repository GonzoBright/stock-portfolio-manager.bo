package com.proserus.stocks.bo.enu;

import com.proserus.stocks.bo.symbols.CurrencyEnum;

public class CurrencyUserType extends PersistentEnumUserType<CurrencyEnum> {

	@Override
	public Class<CurrencyEnum> returnedClass() {
		return CurrencyEnum.class;
	}
}
