package com.proserus.stocks.bo.enu;

import com.proserus.stocks.bo.symbols.SectorEnum;

public class SectorUserType extends PersistentEnumUserType<SectorEnum> {

	@Override
	public Class<SectorEnum> returnedClass() {
		return SectorEnum.class;
	}
}
