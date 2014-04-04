package com.proserus.stocks.bo.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {

	static public BigDecimal setDecimalWithScale(BigDecimal value){
		//TODO the Ifs are only because I'm using the method to display all values as tooltip..
		//It is easier to check for Null once here..
		//And not to round numbers that are already smaller than 5 precision.
		if(value == null){
			return null;
		}
		
//		if(value.precision() <= 5){
//			return value;
//		}
		
		//TODO Should we let the view display the complete numbers ??
		return value.setScale(5,RoundingMode.HALF_EVEN);
	}
	
	static public BigDecimal setDecimalWithScale2(BigDecimal value){
		if(value == null){
			return null;
		}
		return value.setScale(2,RoundingMode.HALF_EVEN);
	}
	
	static public String getString(BigDecimal value){
		return setDecimalWithScale(value).toString();
	}
	
	public static BigDecimal stringToBigDecimal(String value){
		try {
			return new BigDecimal(value);
		} catch (NumberFormatException e) {
			return BigDecimal.ZERO;
		}
	}
	
}
