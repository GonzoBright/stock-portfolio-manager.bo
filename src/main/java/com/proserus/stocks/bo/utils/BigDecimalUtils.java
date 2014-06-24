package com.proserus.stocks.bo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {

	public static BigDecimal HUNDRED = new BigDecimal(100);

	static public BigDecimal setDecimalWithScale(BigDecimal value) {
		if (value == null) {
			return null;
		}

		// TODO Should we let the view display the complete numbers ??
		return value.setScale(5, RoundingMode.HALF_EVEN);
	}

	static public boolean isPositive(BigDecimal value) {
		return value.signum() == 1;
	}

	static public boolean isNotNegative(BigDecimal value) {
		return value.signum() != -1;
	}

	static public BigDecimal setDecimalWithScale2(BigDecimal value) {
		if (value == null) {
			return null;
		}
		return value.setScale(2, RoundingMode.HALF_EVEN);
	}

	static public String getString(BigDecimal value) {
		return String.valueOf(setDecimalWithScale(value));
	}

	public static BigDecimal stringToBigDecimal(String value) {
		try {
			return new BigDecimal(value);
		} catch (NumberFormatException e) {
			return BigDecimal.ZERO;
		}
	}

}
