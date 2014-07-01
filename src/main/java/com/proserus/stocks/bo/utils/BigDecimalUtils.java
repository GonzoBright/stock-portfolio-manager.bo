package com.proserus.stocks.bo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;

public class BigDecimalUtils {

	public static BigDecimal HUNDRED = new BigDecimal(100);

	static public BigDecimal setDecimalWithScale(BigDecimal value) {
		// TODO Should we let the view display the complete numbers ??
		return value != null ? value.setScale(8, RoundingMode.HALF_EVEN) : null;
	}

	static public boolean isPositive(BigDecimal value) {
		return value.signum() == 1;
	}

	static public boolean isNotNegative(BigDecimal value) {
		return value.signum() != -1;
	}

	static public BigDecimal setDecimalWithScale2(BigDecimal value) {
		return value != null ? value.setScale(2, RoundingMode.HALF_EVEN) : null;
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

	public static String formatNumberForDouble(String no) {
		no = no.replace(",", ".");
		return formatNumberForDisplay(no);
	}

	public static String formatNumberForDisplay(String no) {
		if ((no.contains(".") || no.contains(",")) && no.endsWith("0")) {
			while (!no.endsWith(".") && !no.endsWith(",") && no.endsWith("0")) {
				no = StringUtils.removeEnd(no, "0");
			}
		}
		return no;
	}
}
